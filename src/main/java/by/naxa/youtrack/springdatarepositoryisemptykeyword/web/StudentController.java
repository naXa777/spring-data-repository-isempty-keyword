package by.naxa.youtrack.springdatarepositoryisemptykeyword.web;

import by.naxa.youtrack.springdatarepositoryisemptykeyword.model.Student;
import by.naxa.youtrack.springdatarepositoryisemptykeyword.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {this.repository = repository;}

    @GetMapping
    public List<Student> listStudents() {
        return repository.findAll();
    }

}
