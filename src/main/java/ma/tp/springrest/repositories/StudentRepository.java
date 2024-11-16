package ma.tp.springrest.repositories;

import ma.tp.springrest.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findById(int id);
    @Query("SELECT YEAR(s.dateNaissance),count(s) from Student s group by YEAR(s.dateNaissance) ")
    Collection<Object[]> findNbrStudentByYear();
}
