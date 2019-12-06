package com.buba.testdemo2.scheduled;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.annotation.Configuration;

/**
 * @author 四郎
 * @date 2019/11/14 - 10:55
 * 定时任务类
 */
@Configuration
public class SecondScheduled implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //System.out.println("任务内容是---------------------------->"+new Date());
    }
}
