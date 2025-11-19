package com.springjpa.spring_data_jpa_example;

import java.util.Optional;

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
		// repo.save(s1);
		// repo.save(s2);
		// repo.save(s3);

		// show all the data present in the table
		// System.out.println(repo.findAll());

		// show a particular data by id
		// findById return type is Optional which means it will handle
		// nullPointerException ,
		// if data is not present , it return empty data as per out condition
		// Optional<Student> s = repo.findById(103);
		// System.out.println(s.orElse(new Student()));

		// if we want to search by name
		System.out.println(repo.findByName("Amirtha"));

		// showing data by marks
		System.out.println(repo.findByMarksGreaterThan(77));

	}
}
