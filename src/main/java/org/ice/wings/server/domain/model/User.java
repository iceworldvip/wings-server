package org.ice.wings.server.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
public class User extends BaseModel implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1868959294346155501L;

    public User() {
        // TODO Auto-generated constructor stub
    }

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}

