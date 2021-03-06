package com.example.demo;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyClock {

    @Scheduled(initialDelay = 3000, fixedRate = 2000)
    public void tickTock()  {
        log.info("tick tock BEGIN");
        new Thread(() -> doSomeWork()).start();
        log.info("tick tock END");
    }

    @SneakyThrows
    private void doSomeWork() {
        log.info("Do some work BEGIN");
        Thread.sleep(5000);
        log.info("Do some work END");
    }
}
