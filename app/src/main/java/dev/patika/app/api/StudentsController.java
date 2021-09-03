package dev.patika.app.api;

import dev.patika.app.bussiness.abstracts.StudentService;
import dev.patika.app.entity.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/students")
public class StudentsController {
    private final StudentService studentService;
    @GetMapping
    public ResponseEntity getAllStudents(){
        return new ResponseEntity(this.studentService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getStudentById(@PathVariable Long id){
        return new ResponseEntity(this.studentService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveStudent(@RequestBody StudentDto studentDto){
        return new ResponseEntity(this.studentService.save(studentDto), HttpStatus.OK);
    }
}
