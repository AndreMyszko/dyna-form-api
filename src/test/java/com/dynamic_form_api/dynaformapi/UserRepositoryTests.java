package com.dynamic_form_api.dynaformapi;
 
import static org.assertj.core.api.Assertions.assertThat;

import com.dynamic_form_api.dynaformapi.Entity.User;
import com.dynamic_form_api.dynaformapi.Repository.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;
     
    // test methods go below
    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("user123");
        user.setFirstName("First");
        user.setLastName("User");
        
        User savedUser = repo.save(user);
        
        User existUser = entityManager.find(User.class, savedUser.getId());
        
        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
    }
}