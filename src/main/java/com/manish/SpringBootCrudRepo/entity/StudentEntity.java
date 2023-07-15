package com.manish.SpringBootCrudRepo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int id;
	private long roll;
	private String name;
	private String surname;

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(int id, long roll, String name, String surname) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", roll=" + roll + ", name=" + name + ", surname=" + surname + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
