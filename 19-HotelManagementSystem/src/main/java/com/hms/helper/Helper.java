package com.hms.helper;

import java.time.LocalDateTime;
import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Helper {

	
	@Before("execution(* com.hms.controller.ManagerController.getallManagerDetails())")
	public void check() {
		
		System.out.println("User is Autorized Before..");
		System.out.println(LocalDateTime.now());
	}
	
	@After("execution(* com.hms.controller.ManagerController.getallManagerDetails())")
	public void check1() {
		
		System.out.println("User is Autorized After...");
		System.out.println(LocalDateTime.now());
	}
}
