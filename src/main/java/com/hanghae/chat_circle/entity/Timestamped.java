package com.hanghae.chat_circle.entity;

import java.time.LocalDateTime;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Timestamped {

    @CreatedDate // 생성일자
    private LocalDateTime createdAt;

    @LastModifiedDate // 수정일자
    private LocalDateTime modifiedAt;
}
