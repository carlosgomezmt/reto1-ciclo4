package com.usa.proyectoc4.proyectoc4.repository.crud;

import java.util.Optional;

import com.usa.proyectoc4.proyectoc4.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository  extends CrudRepository <User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
