package io.javacoder.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {

	public Topics(String id, String name, String description) {
		super();
		this.id = id;
		Name = name;
		Description = description;
	}
	public Topics() {
	
	}
	@Id
	String id ;
	String Name;
	String Description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
