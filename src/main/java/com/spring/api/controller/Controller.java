package com.spring.api.controller;

import com.spring.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private EmployeeRepository employeeRepository;

}
