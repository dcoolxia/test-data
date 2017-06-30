package cn.test;

import cn.test.exception.ParamCheckException;

public class Test {

    public static void main(String[] args) {
        
    }
    
    public static void myException() throws ParamCheckException{
        int i = 0;
        
        if (i == 0) {
            throw new ParamCheckException("id", "id不为空");
        }
    }

}
