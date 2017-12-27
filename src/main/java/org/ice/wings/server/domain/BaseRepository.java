package org.ice.wings.server.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseRepository<T> {
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * jdbc模板对象
     */
    @Autowired
    protected JdbcTemplate jdbcTemplate;



}
