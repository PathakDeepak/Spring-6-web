package com.example.spring6web.repositories;

import com.example.spring6web.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author valar_morghulis on 19/02/23.
 * @project spring-6-web
 * @description
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
