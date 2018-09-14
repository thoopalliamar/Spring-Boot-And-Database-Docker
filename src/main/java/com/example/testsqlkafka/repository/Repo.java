package com.example.testsqlkafka.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.testsqlkafka.domain.Emp;

@Repository
public interface Repo extends CrudRepository<Emp, String>{

}
