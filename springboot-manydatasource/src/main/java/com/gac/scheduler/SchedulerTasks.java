package com.gac.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTasks {

    private static final SimpleDateFormat sf = new SimpleDateFormat("yyyy-HH-dd hh:mm:ss");

    @Scheduled(fixedRate = 2000)
    private void reportScheduler() {
        System.err.println("定期任务正在启动....." + sf.format(new Date()));
    }
}
