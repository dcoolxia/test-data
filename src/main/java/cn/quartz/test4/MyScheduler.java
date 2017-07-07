package cn.quartz.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class MyScheduler {

    public static void startJob(String cron) throws SchedulerException, ParseException {
        //创建一个JobDetail实例，将该实例与HelloJob Class绑定
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class)
                //.withIdentity("myJob", "group1")
                .build();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //创建一个Trigger实例，定义该job立即执行，并且每隔两秒钟重复执行一次，直到永远
        CronTrigger trigger = (CronTrigger) TriggerBuilder.newTrigger()
                //.withIdentity("myTrigger", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule(cron))
                .build();
        
        //创建Scheduler实例
        SchedulerFactory sfact = new StdSchedulerFactory();
        Scheduler scheduler = sfact.getScheduler();
        scheduler.start();
        Date date = new Date();
        System.out.println("Scheduler启动时间："+sdf.format(date));
        scheduler.scheduleJob(jobDetail, trigger);
    }

}
