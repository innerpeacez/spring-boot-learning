package com.zhw.study.springbootasync;

import com.sun.xml.internal.ws.util.CompletedFuture;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;

@Slf4j
abstract class TaskJob {

    CompletableFuture execute(String arg) throws InterruptedException {
        log.info("执行开始：{}", arg);
        long start = System.currentTimeMillis();
        Thread.sleep(1000 * 2);
        long end = System.currentTimeMillis();
        long time = end - start;
        log.info("执行用时： {} 毫秒", time);
        return new CompletableFuture();
    }
}
