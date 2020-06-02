package com.onion.config;

import io.netty.util.concurrent.DefaultThreadFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.*;

/**
 * @author: yu
 * @description: 任务调度 配置类
 * @create: 2020-06-02 10:25
 **/
@EnableScheduling
@Configuration
@EnableAsync
public class TaskScheduleConfig {

    /**
     * 设置 一个固定数量的线程池，供任务调度使用
     * @return
     */
    @Bean
    public ExecutorService scheduleThreadPool() {
        return new ThreadPoolExecutor(10, 20,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(), new DefaultThreadFactory("任务调度线程"));
    }


}
