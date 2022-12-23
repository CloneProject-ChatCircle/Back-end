package com.hanghae.chat_circle.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestApiException {
	private String msg;
	private int statusCode;
}
