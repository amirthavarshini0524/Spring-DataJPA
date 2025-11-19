package com.springjpa.spring_data_jpa_example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springjpa.spring_data_jpa_example.model.Student;
import java.util.List;


public interface StudentRepo extends JpaRepository<Student,Integer>{
    
    /*
        for the "findByName"  we don't need @Query because if we remove it, also works , 
        because JPQL used DSL(Domain Specific language) it automatically create method by searching column name 
        but most of the time it will not work .countBy\

        so we need to write query by using @Query
    */
    @Query("select s from Student s where s.name=?1")
    List<Student> findByName(String name);

    List<Student> findByMarksGreaterThan(int marks);
}
