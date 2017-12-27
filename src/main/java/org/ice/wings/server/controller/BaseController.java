package org.ice.wings.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/backend/")
public class BaseController {
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}
