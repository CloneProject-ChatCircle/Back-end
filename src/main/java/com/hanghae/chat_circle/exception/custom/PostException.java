package com.hanghae.chat_circle.exception.custom;

import lombok.Getter;

@Getter
public class PostException extends CommonException {

	public PostException(ErrorCode errorCode) {
		super(errorCode);
	}
}
