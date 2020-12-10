package com.cos.blog.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.dto.ResponseDto;

@ControllerAdvice // 모든 Exception이 발생하면 이쪽으로 오게하기위한 어노테이션
@RestController
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class) // 해당 value Exception 발생시 이 핸들러 실행
	public ResponseDto<String> handleArgumentException(Exception e) {
		 return new ResponseDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
		
	}
}
