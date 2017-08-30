package com.spring.cloud.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhiming  2017/8/30 16:07
 */
@RestController
public class AddRest {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        logger.info("/add, a={}:" + a + ",b:" + b + ", result:" + r);
        return r;
    }
}
