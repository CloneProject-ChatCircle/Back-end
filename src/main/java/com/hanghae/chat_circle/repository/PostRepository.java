package com.hanghae.chat_circle.repository;

import com.hanghae.chat_circle.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
