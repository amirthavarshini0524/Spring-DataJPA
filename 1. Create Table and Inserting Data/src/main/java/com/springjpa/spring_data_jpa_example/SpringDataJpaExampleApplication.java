package com.springjpa.spring_data_jpa_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjpa.spring_data_jpa_example.model.Student;
import com.springjpa.spring_data_jpa_example.repo.StudentRepo;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRolNo(101);
		s1.setName("Amirtha");
		s1.setMarks(75);

		s2.setRolNo(102);
		s2.setName("varshini");
		s2.setMarks(99);

		s3.setRolNo(103);
		s3.setName("Sakthi");
		s3.setMarks(88);

		// store data in database
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
	}
}
