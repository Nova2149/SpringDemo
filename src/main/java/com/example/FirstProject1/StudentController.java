package com.example.FirstProject1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {
	@Autowired
	private StudentService service;

	@Autowired
	private RegisterService registerService;

	
	@GetMapping("/getStudents")
	@ResponseBody
	public ResponseEntity<?> getAllStudents(Model model)
	{	
		List<Student> listStudent=service.listAll();
		
		return new ResponseEntity<List<Student>>(listStudent,HttpStatus.OK);
	}
	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<?> hellowrold()
	{
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
		
		
	}
	//This api is used for Registering New users to database

	@PostMapping("/getUserByEmail")
	@ResponseBody
	public ResponseEntity<?> getByMail(@RequestBody String email)
	{
		Register reg=registerService.findByEmail(email);
		System.out.println(reg.toString());
		return new  ResponseEntity<Register> (reg,HttpStatus.OK);

	}


}
