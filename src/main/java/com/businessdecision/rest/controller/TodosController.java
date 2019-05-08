/**
 * 
 */
package com.businessdecision.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.businessdecision.rest.domain.Todo;
import com.businessdecision.rest.service.TodoHardcodedService;

/**
 * Rest Controller for {@link Todo}s.
 * @author bernard.adanlessossi
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodosController {
	
	@Autowired
	private TodoHardcodedService todoService;

	@GetMapping("/users/{username}/todos")
	public List<Todo> retrieveAllTodos(@PathVariable String username){
		return todoService.findAll();
	}
}
