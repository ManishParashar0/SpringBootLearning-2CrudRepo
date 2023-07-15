package com.manish.SpringBootCrudRepo.repo;

import org.springframework.data.repository.CrudRepository;

import com.manish.SpringBootCrudRepo.entity.StudentEntity;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {

}
