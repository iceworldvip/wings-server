package org.ice.wings.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 基础路由控制器
 * <p>
 * 提供统一路由规则和统一的前置操作等
 *
 * @author ice
 * @version 1.0
 */
@RestController
@RequestMapping(path = "/backend/")
public class BaseController {
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
