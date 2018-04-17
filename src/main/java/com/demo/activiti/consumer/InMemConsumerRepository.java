package com.demo.activiti.consumer;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InMemConsumerRepository {
    
    private final Map<Long, Consumer> consumers;

    public InMemConsumerRepository() {
        consumers = new HashMap<>();
        consumers.put(100L, new Consumer(100L, "Bob", "Brown", "123456789"));
        consumers.put(101L, new Consumer(101L, "Lee", "Hanson", "100000000"));
    }

    public Optional<Consumer> findById(Long id) {
        return Optional.of(consumers.get(id));
    }
}