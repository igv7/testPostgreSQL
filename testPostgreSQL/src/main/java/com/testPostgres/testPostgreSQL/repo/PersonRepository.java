package com.testPostgres.testPostgreSQL.repo;

import org.springframework.data.repository.CrudRepository;

import com.testPostgres.testPostgreSQL.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
