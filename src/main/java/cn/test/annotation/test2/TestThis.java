package cn.test.annotation.test2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestThis {

    public static void main(String[] args) throws Exception {
        // 提取到被注解的方法Method，这里用到了反射的知识
        Method method = Class.forName("cn.test.annotation.test2.Person").getDeclaredMethod("info");
        // 从Method方法中通过方法getAnnotation获得我们设置的注解
        TwoAnnotation t = method.getAnnotation(TwoAnnotation.class);
        OneAnnotation o = method.getAnnotation(OneAnnotation.class);

        // 得到注解的俩参数
//        System.out.println(t.name());
//        System.out.println(t.age());
//        System.out.println(o.interest());
        
        Annotation[] annotations = method.getAnnotations();
        for (Annotation a:annotations) {
            if (a.annotationType().equals(OneAnnotation.class)) {
                System.out.println(((OneAnnotation) a).interest());
            } else {
                System.out.println(((TwoAnnotation) a).name());
                System.out.println(((TwoAnnotation) a).age());
            }
        }
    }
}