package org.ice.wings.server.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * 用户模板类
 * @author ice
 * @version 1.0
 */
@Entity
@Table(name = "user")
@Data
public class UserModel extends BaseModel implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1868959294346155501L;

    @Getter
    @Setter
    @Column(name = "username",
            columnDefinition = "varchar(32) DEFAULT '' COMMENT '用户名称'")
    private String username;

    @Getter
    @Setter
    @Column(name = "password",
            columnDefinition = "varchar(18) DEFAULT '' COMMENT '用户密码'")
    private String password;

}

