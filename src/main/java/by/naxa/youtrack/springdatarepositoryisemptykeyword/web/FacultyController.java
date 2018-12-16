package by.naxa.youtrack.springdatarepositoryisemptykeyword.web;

import by.naxa.youtrack.springdatarepositoryisemptykeyword.model.Faculty;
import by.naxa.youtrack.springdatarepositoryisemptykeyword.repository.FacultyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    private final FacultyRepository repository;

    public FacultyController(FacultyRepository repository) {this.repository = repository;}

    @GetMapping("/noStudents")
    public List<Faculty> listFacultiesWithNoStudents() {
        return repository.findAllByStudentsIsEmpty();
    }

    @GetMapping
    public List<Faculty> listFaculties() {
        return repository.findAll();
    }

}
