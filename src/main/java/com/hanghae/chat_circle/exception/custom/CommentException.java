package com.hanghae.chat_circle.exception.custom;

import lombok.Getter;

@Getter
public class CommentException extends CommonException {

	public CommentException(ErrorCode errorCode) {
		super(errorCode);
	}
}
