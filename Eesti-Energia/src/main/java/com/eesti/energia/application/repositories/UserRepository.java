package com.eesti.energia.application.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.eesti.energia.application.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}
