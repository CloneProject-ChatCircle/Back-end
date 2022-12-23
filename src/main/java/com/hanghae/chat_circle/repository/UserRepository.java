package com.hanghae.chat_circle.repository;

import com.hanghae.chat_circle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
