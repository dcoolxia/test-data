package cn.test.annotation.test2;

/**
 * 一个用到了自定义的注解的类
 */
public class Person {

    @TwoAnnotation(name = "zhangsan", age = 18)
    @OneAnnotation(interest = "run")
    public void info() {
        
    }
}