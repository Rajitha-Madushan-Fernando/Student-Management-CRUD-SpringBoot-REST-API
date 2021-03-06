package com.wisdom.demo.CrudDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisdom.demo.CrudDemo.model.Student;
import com.wisdom.demo.CrudDemo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping
	public Student save(@RequestBody Student student) {
		try {
			return studentService.save(student);
		} catch (Exception e) {
			//This is a comment!
			return null;
		}
	
	}
	@GetMapping
	public List<Student> getStudent(){
		try {
			return studentService.getStudent();
		} catch (Exception e) {
			return null;
		}
	}
	@PutMapping
	public Student update(@RequestBody Student student) {
		try {
			 	return studentService.update(student); 	
		} catch (Exception e) {
			return null;
		}
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		try {
			studentService.delete(id);
		} catch (Exception e) {
			
		}
	}
	
}
