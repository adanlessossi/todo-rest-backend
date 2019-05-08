/**
 * 
 */
package com.businessdecision.rest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.businessdecision.rest.domain.Todo;

/**
 * A hardcoded service to return all todos.
 * 
 * @author bernard.adanlessossi
 *
 */
@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList<>();

	private static Long idCounter = 0L;

	/**
	 * Static initializer.
	 */
	static {
		todos.add(new Todo(++idCounter, "Bernard", "Learn Python", new Date(), false));
		todos.add(new Todo(++idCounter, "Bernard", "Build a Raspberry firewall", new Date(), false));
		todos.add(new Todo(++idCounter, "Bernard", "Fix Up the Telescop", new Date(), false));
	}

	/**
	 * Return the list of {@link Todo}.
	 * 
	 * @return the list
	 */
	public List<Todo> findAll() {
		return todos;
	}

	/**
	 * Deletes a {@link Todo} by id.
	 * 
	 * @param id the given id
	 * @return the deleted item
	 */
	public Todo deleteById(Long id) {
		Todo currentTodo = findById(id);
		if (currentTodo == null) {
			return null;
		} else {
			todos.remove(currentTodo);
			return currentTodo;
		}
	}

	/**
	 * Finds a {@link Todo} by id.
	 * 
	 * @param id the given id
	 * @return the item
	 */
	public Todo findById(Long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
}
