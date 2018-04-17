package com.demo.activiti.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {
    
    private Long id;
    private String firstName;
    private String lastName;
    private String ssn;
    
}
