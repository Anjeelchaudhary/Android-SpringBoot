 package com.jpa.test.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User , Integer>{

}
