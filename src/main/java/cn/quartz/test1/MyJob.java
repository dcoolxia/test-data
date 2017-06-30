package cn.quartz.test1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.TriggerKey;

/**
 * 第一种方式取JobDataMap的值：
 * getJobDetail()和getTrigger()
 */
public class MyJob implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Job执行时间："+sdf.format(date));
        System.out.println("Hello Job!");
        
        JobKey jobKey = context.getJobDetail().getKey();
        System.out.println("job："+jobKey.getGroup()+","+jobKey.getName()+","+jobKey.getClass());
        
        TriggerKey triggerKey = context.getTrigger().getKey();
        System.out.println("trigger："+triggerKey.getGroup()+","+triggerKey.getName()+","+triggerKey.getClass());
        
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        System.out.println(jobDataMap.getString("message1"));
        
        JobDataMap triggerDataMap = context.getTrigger().getJobDataMap();
        System.out.println(triggerDataMap.getString("message2"));
    }

}
