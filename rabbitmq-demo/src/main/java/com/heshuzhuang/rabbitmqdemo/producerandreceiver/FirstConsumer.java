package com.heshuzhuang.rabbitmqdemo.producerandreceiver;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者1
 * @author zhuzhe
 * @date 2018/5/25 17:32
 * @email 1529949535@qq.com
 */
@Component
public class FirstConsumer {

    /**
     * queues  指定从哪个队列（queue）订阅消息
     * @param message
     */
    @RabbitListener(queues = {"first-queue"})
    public void handleMessage(Message message){
        // 处理消息
        System.out.println("FirstConsumer {} handleMessage :"+message);
    }

    /**
     * 测试topic订阅是否成功
     * @param message
     */
    @RabbitListener(queues = {"second-queue"})
    public void handleMessag(Message message){
        // 处理消息
        System.out.println("SecondConsumer {} handleMessage :"+message);
    }


}
