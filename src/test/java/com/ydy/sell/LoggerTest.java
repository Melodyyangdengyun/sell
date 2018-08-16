package com.ydy.sell;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * DiYun 2018/8/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
         logger.info("info....");
         logger.error("error....");
    }
}
