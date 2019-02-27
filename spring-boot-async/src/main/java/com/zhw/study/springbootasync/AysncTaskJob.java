package com.zhw.study.springbootasync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class AysncTaskJob extends TaskJob {

    @Async
    public CompletableFuture execute(String arg) throws InterruptedException {
        super.execute(arg);
        return new CompletableFuture();
    }
}

