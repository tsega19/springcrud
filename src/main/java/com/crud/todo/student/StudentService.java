package com.crud.todo.student;

import com.crud.todo.Video;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudent(){
        return  studentRepository.findAll();
    }
    public boolean addStudent(Student studnet){
        studentRepository.save(studnet);
        return true;
    }
}

