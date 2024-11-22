package com.estudio.BasicAPI.repository;

import com.estudio.BasicAPI.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByTelefono(String email);

}
