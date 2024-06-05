package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main (String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	@Autowired
	private StudentRepository studentreps;
	public void run(String... args) throws Exception{
		Student st=new Student();
		st.setEmail("msdvk@gmail.com");
		st.setFaname("King");
		st.setLname("Kohli");
		studentreps.save(st);
	}

}
