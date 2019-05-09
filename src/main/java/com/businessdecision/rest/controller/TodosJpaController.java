/**
 * 
 */
package com.businessdecision.rest.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.businessdecision.rest.domain.Todo;
import com.businessdecision.rest.repository.TodosRepository;
import com.businessdecision.rest.service.TodoHardcodedService;

/**
 * @author bernard.adanlessossi
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodosJpaController {

//	@Autowired
//	private TodoHardcodedService todoService;

	@Autowired
	private TodosRepository todoRepository;

	@GetMapping("/jpa/users/{username}/todos")
	public List<Todo> retrieveAllTodos(@PathVariable String username) {
		return this.todoRepository.findByUsername(username);
		// return todoService.findAll();
	}

	@DeleteMapping("/jpa/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable Long id) {
		this.todoRepository.deleteById(id);
		return ResponseEntity.noContent().build();

	}

	@GetMapping("/jpa/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable Long id) {
		return this.todoRepository.findById(id).get();
		// return todoService.findById(id);
	}

	@PutMapping("/jpa/users/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable Long id,
			@RequestBody Todo todo) {
		Todo updatedTodo = this.todoRepository.save(todo);

		return new ResponseEntity<Todo>(updatedTodo, HttpStatus.OK);

	}

	@PostMapping("/jpa/users/{username}/todos")
	public ResponseEntity<Todo> createTodo(@PathVariable String username, @RequestBody Todo todo) {
		
		todo.setUsername("Bernard");
		Todo createdTodo = this.todoRepository.save(todo);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(createdTodo.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}
}
