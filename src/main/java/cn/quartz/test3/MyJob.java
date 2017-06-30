package cn.quartz.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.TriggerKey;

import lombok.Getter;
import lombok.Setter;

/**
 * 第三种方式取JobDataMap的值：
 * 通过get、set方法
 */
@Setter
@Getter
public class MyJob implements Job{
    private String message1;
    private String message2;
    
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
        
        System.out.println(message1);
        System.out.println(message2);
    }

}
