package org.ice.wings.server.domain;

import org.ice.wings.server.domain.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository extends BaseRepository {

    public List<User> getAllUserList() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new UserRepository.UserMapper());
    }

    /**
     *
     */
    public static class UserMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getLong("id"));
            user.setPassword(resultSet.getString("password"));
            user.setUsername(resultSet.getString("username"));
            return user;
        }
    }
}
