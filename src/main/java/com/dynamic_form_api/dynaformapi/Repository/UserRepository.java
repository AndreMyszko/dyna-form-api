package com.dynamic_form_api.dynaformapi.Repository;

import com.dynamic_form_api.dynaformapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface UserRepository extends JpaRepository<User, Long> {
 
}