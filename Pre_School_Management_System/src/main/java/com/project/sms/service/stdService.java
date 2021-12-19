package com.project.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sms.entity.Student;
import com.project.sms.repository.stdRepo;

@Service
public class stdService {

	@Autowired
	private stdRepo repo;
	
	public void add_Student(Student s) {
		repo.save(s);
	}
	
	public List<Student> getAllStudent(){
		return repo.findAll();
		
	}

	public Student getStdById(int id) {
		
		Optional<Student> s=repo.findById(id);
		if(s.isPresent()) {
			return s.get();
		}
		return null;
	}
	
	public void deleteStd(int id) {
		repo.deleteById(id);
	}
	
}
