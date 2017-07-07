package cn.quartz.test4;

import java.text.ParseException;

import org.quartz.SchedulerException;

public class Test {

    public static void main(String[] args) {
        
        try {
            String cron = "*/3 * * * * ? *";
            MyScheduler.startJob(cron);
            Thread.sleep(2000);
            MyScheduler.startJob(cron);
        } catch (SchedulerException | ParseException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
