package com.buba.testdemo2.scheduled;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author 四郎
 * @date 2019/11/14 - 11:29
 */
public class TestQuratz {
    public static void main(String[] args) throws Exception {
        //创建job对象，通过Builder创建
        JobDetail jobDetail = JobBuilder.newJob(SecondScheduled.class).build();
        //传入的ScheduleBuilder有两种：一种是SimpleScheduleBuiler 主要用于 时分秒
        //                             一种是cronScheduleBuilder  主要用于
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder
                          .repeatSecondlyForever(2)).build();
        //得到Scheduler对象，即任务执行环境
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        //执行任务按照时间节点的调度
        scheduler.scheduleJob(jobDetail,trigger);
        //启动scheduler
        scheduler.start();
    }
}
