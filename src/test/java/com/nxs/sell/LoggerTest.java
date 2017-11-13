package com.nxs.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void TestLogger(){
        String name = "jonenxs";
        String password = "123456";

        log.info("info信息");
        log.debug("debug信息");
        log.error("错误信息");
        log.info("name: {},   password: {}",name,password);
    }

}