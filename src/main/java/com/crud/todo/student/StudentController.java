package com.crud.todo.student;

import com.crud.todo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping
public class StudentController {
    private final StudentService  studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService ;
    }
    @GetMapping("/")
   public  List<Student> getStudent(){
        return studentService.getAllStudent();
    }
    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        boolean isadd = studentService.addStudent(student);

        if(isadd){
            return ResponseEntity.ok().build();
        }
        return  ResponseEntity.badRequest().build();
    }
}
