package org.ice.wings.server.domain;

import org.ice.wings.server.domain.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepository {

    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * jdbc模板对象
     */
    @Autowired
    protected JdbcTemplate jdbcTemplate;

    /**
     *
     */
    public static class UserMapper implements RowMapper<UserModel> {

        @Override
        public UserModel mapRow(ResultSet resultSet, int i) throws SQLException {
            UserModel user = new UserModel();
            user.setId(resultSet.getLong("id"));
            user.setPassword(resultSet.getString("password"));
            user.setUsername(resultSet.getString("username"));
            return user;
        }
    }
}
