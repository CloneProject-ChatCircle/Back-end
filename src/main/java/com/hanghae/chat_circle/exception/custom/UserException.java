package com.hanghae.chat_circle.exception.custom;

import lombok.Getter;

@Getter
public class UserException extends CommonException {

	public UserException(ErrorCode errorCode) {
		super(errorCode);
	}
}
