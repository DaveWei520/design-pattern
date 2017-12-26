package com.weiyu.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyu@gomeholdings.com
 * @description 构造者模式
 * @create 2017/6/26
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}
