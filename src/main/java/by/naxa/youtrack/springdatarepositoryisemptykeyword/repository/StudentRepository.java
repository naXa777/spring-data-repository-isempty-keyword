package by.naxa.youtrack.springdatarepositoryisemptykeyword.repository;

import by.naxa.youtrack.springdatarepositoryisemptykeyword.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
