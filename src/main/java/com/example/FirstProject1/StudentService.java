package com.example.FirstProject1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private  StudentRepository repo;
	
	
	public List<Student> listAll(){
		return repo.findAll();
	}
	public void save(Student std)
	{
		repo.save(std);
	}
	public void delete(long id)
	{
		repo.deleteById(id);
	}
	public Student get(long id)
	{
		return repo.findById(id).get();
		
	}
	
}
