package com.zhw.study.springbootasync;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CompletableFuture;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAsyncApplicationTests {

    @Autowired
    private SynchTaskJob synchTaskJob;

    @Autowired
    private AysncTaskJob aysncTaskJob;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSynch() throws InterruptedException {
        synchTaskJob.execute("1");
        synchTaskJob.execute("2");
        synchTaskJob.execute("3");
    }

    @Test
    public void testAsync() throws InterruptedException {
        CompletableFuture execute = aysncTaskJob.execute("1");
        CompletableFuture execute1 = aysncTaskJob.execute("2");
        CompletableFuture execute2 = aysncTaskJob.execute("3");

    }
}
