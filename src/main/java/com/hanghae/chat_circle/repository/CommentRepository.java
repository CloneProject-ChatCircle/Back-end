package com.hanghae.chat_circle.repository;

import com.hanghae.chat_circle.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
