package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@RestController
@RequestMapping("/api/v1/students")
public class StudentControler {
@Autowired
private StudentRepository studentreps;

@GetMapping
public List<Student> getAllStudents(){
	return studentreps.findAll();
}

@PostMapping
public Student createstudent(@RequestBody Student student)
{
	return studentreps.save(student);
}

@GetMapping("{id}")

public ResponseEntity <Student> getstudentbyid(@PathVariable long id)
{
	Student student=studentreps.findById(id).orElseThrow(null);
	return ResponseEntity.ok(student);
}
@DeleteMapping("{id}")
public ResponseEntity <Student> deletestudentbyid(@PathVariable long id)
{
	Student student=studentreps.findById(id).orElseThrow(null);
	studentreps.delete(student);
	return ResponseEntity.ok(student);
}
}
