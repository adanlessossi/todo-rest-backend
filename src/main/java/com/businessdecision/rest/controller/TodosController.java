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
import org.springframework.web.util.UriComponents;

import com.businessdecision.rest.domain.Todo;
import com.businessdecision.rest.service.TodoHardcodedService;

/**
 * Rest Controller for {@link Todo}s.
 * 
 * @author bernard.adanlessossi
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodosController {

	@Autowired
	private TodoHardcodedService todoService;

	@GetMapping("/users/{username}/todos")
	public List<Todo> retrieveAllTodos(@PathVariable String username) {
		return todoService.findAll();
	}

	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable Long id) {
		Todo todo = this.todoService.deleteById(id);
		if (todo != null) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();

	}

	@GetMapping("/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable Long id) {
		return todoService.findById(id);
	}

	@PutMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String username, @PathVariable Long id,
			@RequestBody Todo todo) {
		Todo updatedTodo = this.todoService.save(todo);

		return new ResponseEntity<Todo>(updatedTodo, HttpStatus.OK);

	}

	@PostMapping("/users/{username}/todos")
	public ResponseEntity<Todo> createTodo(@PathVariable String username,
			@RequestBody Todo todo) {
		Todo createdTodo = this.todoService.save(todo);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(createdTodo.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
}
