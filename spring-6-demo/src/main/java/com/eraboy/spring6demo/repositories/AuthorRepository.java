package com.eraboy.spring6demo.repositories;

import com.eraboy.spring6demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
