package com.example.rabbitmq.springrabbitmqproducer.controller;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmq.springrabbitmqproducer.model.Message;

@RestController
public class Producer {
@Autowired
private RabbitTemplate rabbitTemplate;
@Autowired
private FanoutExchange exchange;
@PostMapping("/post")
public String send(@RequestBody Message message)
{
rabbitTemplate.convertAndSend(exchange.getName(),"",message);
return "Message sent successfully";
}
}
