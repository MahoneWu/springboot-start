package com.mouse.moon.service;

/**
 * Created by wuhao on 16/11/14.
 */
public class HelloService {

    private String msg;


    public String sayHello(){
        return  "Hello" +msg;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
