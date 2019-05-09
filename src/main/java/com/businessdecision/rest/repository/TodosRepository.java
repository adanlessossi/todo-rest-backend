/**
 * 
 */
package com.businessdecision.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.businessdecision.rest.domain.Todo;

/**
 * The {@link Todo}'s repository.
 * @author bernard.adanlessossi
 *
 */
@Repository
public interface TodosRepository extends JpaRepository<Todo, Long> {

	public List<Todo> findByUsername(final String username);
}
