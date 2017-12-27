package org.ice.wings.server.domain;

import org.ice.wings.server.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {

}
