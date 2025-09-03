package com.sachin.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.sachin.security.Login;

//@Aspect
//@Component
public class LoginCheck {

	
//	@Around("execution(* com.sachin.controller.*.*(..)) && !execution(* com.sachin.controller.Controller.*(..))")
//	public Object before(ProceedingJoinPoint joinpoint) throws Throwable {
//		if(!Login.isLOGIN()) {
//			return "Home";
//		}
//		
//		return joinpoint.proceed();
//		
//	}
}
