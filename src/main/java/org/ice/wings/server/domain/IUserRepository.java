package org.ice.wings.server.domain;

import org.ice.wings.server.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 用户数据仓库接口
 *
 * @author ice
 * @version 1.0
 */
public interface IUserRepository extends JpaRepository<UserModel, Long> {
    /**
     * @param username
     * @return
     */
    @Query(value = "from UserModel um where username=?")
    List<UserModel> getUserListByUsername(String username);
}
