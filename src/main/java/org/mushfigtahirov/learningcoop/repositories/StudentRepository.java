package org.mushfigtahirov.learningcoop.repositories;

import org.mushfigtahirov.learningcoop.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
// This class contains one custom query
public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findByFirstname(String firstname);
}
