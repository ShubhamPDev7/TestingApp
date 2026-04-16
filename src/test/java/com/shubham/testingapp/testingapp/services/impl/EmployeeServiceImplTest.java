package com.shubham.testingapp.testingapp.services.impl;

import com.shubham.testingapp.testingapp.TestContainerConfiguration;
import com.shubham.testingapp.testingapp.services.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(TestContainerConfiguration.class)
@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void testGetEmployeeById_WhenEmployeeIsPresent_ThenReturnEmployeeDto() {
        employeeService.getEmployeeById(1L);
    }
}