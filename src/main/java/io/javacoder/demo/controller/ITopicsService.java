package io.javacoder.demo.controller;

import java.util.Optional;

public interface ITopicsService {
	
	Optional<Topics> findById(String id);

}
