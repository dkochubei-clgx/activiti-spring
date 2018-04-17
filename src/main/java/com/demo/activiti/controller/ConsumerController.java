package com.demo.activiti.controller;

import com.demo.activiti.consumer.Consumer;
import com.demo.activiti.consumer.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("consumer")
public class ConsumerController {
    
    private final ConsumerRepository consumerRepository;

    @Autowired
    public ConsumerController(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }
    
    @GetMapping("/{consumerId}")
    public ResponseEntity<Consumer> findConsumer(@PathVariable Long consumerId) {
        return consumerRepository.findById(consumerId)
                .map(consumer -> new ResponseEntity<>(consumer, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
}
