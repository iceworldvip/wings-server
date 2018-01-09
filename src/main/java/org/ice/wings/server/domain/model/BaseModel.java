package org.ice.wings.server.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 数据模板基础类
 * @author ice
 * @version 1.0
 */
@MappedSuperclass
public class BaseModel implements Serializable {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",
            columnDefinition = "bigint unsigned COMMENT 'ID'")
    protected Long id;

    @Getter
    @Setter
    @Column(name = "is_deleted",
            columnDefinition = "tinyint DEFAULT 0 COMMENT '是否已删除：0、未删除 1、已删除'")
    protected Byte isDeleted;

    @Getter
    @Setter
    @Column(name = "is_valid",
            columnDefinition = "tinyint DEFAULT 1 COMMENT '数据是否有效：0、无效 1、有效'")
    protected Byte isValid;

    @Getter
    @Setter
    @Column(name = "creator_id",
            columnDefinition = "bigint unsigned DEFAULT 0 COMMENT '创建者ID'")
    protected Long creatorId;

    @Getter
    @Setter
    @Column(name = "create_time",
            nullable = false,
            updatable = false,
            columnDefinition = "datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createTime;

    @Getter
    @Setter
    @Column(name = "updater_id",
            columnDefinition = "bigint unsigned DEFAULT 0 COMMENT '更新者ID'")
    protected Long updaterId;

    @Getter
    @Setter
    @Column(name = "update_time",
            columnDefinition = "datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date updateTime;
}
