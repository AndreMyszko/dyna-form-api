package com.dynamic_form_api.dynaformapi.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
     
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Getter
    @Setter
    @Column(nullable = false, unique = true, length = 45)
    private String email;
     
    @Getter
    @Setter
    @Column(nullable = false, length = 64)
    private String password;
     
    @Getter
    @Setter
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Getter
    @Setter
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;
     
}