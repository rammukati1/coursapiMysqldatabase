package io.javacoder.demo.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TopicsRepository extends CrudRepository <Topics , String> {

}
