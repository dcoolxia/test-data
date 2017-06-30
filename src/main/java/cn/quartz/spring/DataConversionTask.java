package cn.quartz.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
public class DataConversionTask {
    /** 日志对象 */
    private static final Logger log = LoggerFactory.getLogger(DataConversionTask.class);

    public void run() {
        System.out.println("执行=========");
        if (log.isInfoEnabled()) {
            log.info("数据转换任务线程开始执行");
        }
    }
}