package com.springboot.blog.repository;

import com.springboot.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByUserName(String username);
    Optional<User> findUserByEmailOrUserName(String username,String email);
    Boolean existsByUserName(String username);
    Boolean existsByEmail(String email);
}
