package com.crud.todo.student;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
    @Generated
    @Id
    @SequenceGenerator(
            name= "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long Id;
    private  String name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;
    
    public Integer getAge(){
        return LocalDate.now().getYear() - dob.getYear();
    }
}
