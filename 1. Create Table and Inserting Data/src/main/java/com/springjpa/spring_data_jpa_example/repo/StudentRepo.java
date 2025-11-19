package com.springjpa.spring_data_jpa_example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springjpa.spring_data_jpa_example.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{
    
}
