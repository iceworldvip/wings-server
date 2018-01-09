package org.ice.wings.server.domain.model.test;

import lombok.Data;
import org.ice.wings.server.commons.DataBase;
import org.ice.wings.server.commons.Table;
import org.ice.wings.server.commons.TableField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

@DataBase(name = "test")
@Table(name = "user")
@Data
class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1868959294346155501L;

    public User() {
        // TODO Auto-generated constructor stub
    }

    @TableField(name = "id")
    private Long id;
    @TableField(name = "username")
    private String username;
    @TableField(name = "password")
    private String password;

}


public class UserTest {
    private static Logger logger = LoggerFactory.getLogger(UserTest.class);
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        String dataBase = user.getClass().getAnnotation(DataBase.class).name();
        String tableName = user.getClass().getAnnotation(Table.class).name();
        StringBuilder sbInsertSQL = new StringBuilder("insert into " + dataBase + "." + tableName + "(");
        StringBuilder sbValuesSQL = new StringBuilder();
        Field[] declaredFields = user.getClass().getDeclaredFields();
        List<Object> list = new ArrayList<>();
        for (int i = 0, index = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }
            try {
                String fieldName = field.getAnnotation(TableField.class).name();
                if (index != 0) {
                    sbInsertSQL.append(",");
                    sbValuesSQL.append(",");
                }
                index++;
                sbInsertSQL.append(fieldName);
                list.add(field.get(user));
                sbValuesSQL.append("?");
            }catch (NullPointerException npe){
                continue;
            }

        }
        sbInsertSQL.append(") values (");
        sbInsertSQL.append(sbValuesSQL);
        sbInsertSQL.append(");");

        logger.info(sbInsertSQL.toString());
    }
}
