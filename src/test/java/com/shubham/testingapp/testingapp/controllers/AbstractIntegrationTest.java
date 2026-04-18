package com.shubham.testingapp.testingapp.controllers;

import com.shubham.testingapp.testingapp.TestContainerConfiguration;
import com.shubham.testingapp.testingapp.dto.EmployeeDto;
import com.shubham.testingapp.testingapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webtestclient.autoconfigure.AutoConfigureWebTestClient;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient(timeout = "100000")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestContainerConfiguration.class)
public class AbstractIntegrationTest {
    @Autowired
    WebTestClient webTestClient;

    Employee testEmployee = Employee.builder()
            .id(1L)
                .email("shubham@gmail.com")
                .name("Shub")
                .salary(200L)
                .build();
    EmployeeDto testEmployeeDto = EmployeeDto.builder()
            .id(1L)
                .email("shubham@gmail.com")
                .name("Shub")
                .salary(200L)
                .build();
}
