package com.study.Receive.service;

import com.study.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created with Chenquan.
 * Description:
 * Date: 2019-01-04
 * Time: 10:40
 */
@Component
public class HelloReceive {

//    @RabbitListener(queues="queue")    //监听器监听指定的Queue ，注：如果报错：Failed to declare queue,就是rabbitMQ中没有这个消息队列，需要到rabbitMQ的控制台添加
//    public void processC(String str) {
//        System.out.println("Receive:"+str);
//    }

    @RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void process1(User user) {    //用User作为参数
        System.out.println("Receive1:"+user);
    }

}