package com.yew1eb.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestAspect.class);
    public void doBefore(JoinPoint jp) {
        Object[] objects=jp.getArgs();
        for(Object object:objects){
            LOGGER.info(object.toString()); // 打印日志信息
        }
    }

}