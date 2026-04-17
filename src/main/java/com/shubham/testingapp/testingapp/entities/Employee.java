package com.shubham.testingapp.testingapp.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    private Long id;

    @Column(unique = true)
    private String email;

    private String name;

    private Long salary;
}
