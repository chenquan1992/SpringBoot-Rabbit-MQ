package com.study.Sender.service;

import com.study.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with Chenquan.
 * Description:
 * Date: 2019-01-04
 * Time: 10:33
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send() {
//        template.convertAndSend("queue","hello,chenquan 陈铨");

        User user=new User();    //实现Serializable接口
        user.setUsername("chenquan hello");
        user.setPassword("123");
        template.convertAndSend("queue",user);


    }
}
