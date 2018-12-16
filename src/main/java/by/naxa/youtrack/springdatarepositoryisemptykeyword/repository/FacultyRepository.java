package by.naxa.youtrack.springdatarepositoryisemptykeyword.repository;

import by.naxa.youtrack.springdatarepositoryisemptykeyword.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@SuppressWarnings("SpringDataRepositoryMethodParametersInspection")
@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    List<Faculty> findAllByStudentsIsEmpty();

    List<Faculty> findByStudentsEmpty();

}
