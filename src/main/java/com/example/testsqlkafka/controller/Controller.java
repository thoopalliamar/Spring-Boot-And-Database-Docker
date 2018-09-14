package com.example.testsqlkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.testsqlkafka.domain.Emp;
import com.example.testsqlkafka.repository.Repo;


@RestController
@RequestMapping("/employee")
public class Controller {
	
	@Autowired
	Repo employeeRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Emp create(@RequestBody Emp employee){
		
		Emp result = employeeRepository.save(employee);
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
	public Iterable<Emp> get(@PathVariable String employeeId){
		return employeeRepository.findAll();
	}

}
