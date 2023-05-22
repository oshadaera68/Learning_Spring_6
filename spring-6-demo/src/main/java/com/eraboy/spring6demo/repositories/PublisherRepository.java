package com.eraboy.spring6demo.repositories;

import com.eraboy.spring6demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
