package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] args) throws Exception 
	{

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RegisterAspect.class);
//		ctx.register(RegisterAspect.class);
//		ctx.refresh();

		Bank bank = ctx.getBean(Bank.class);
		bank.deposit("YES123");
	}

}
//OUTPUT:-inside deposit() method!..
//You have successfully deposited... 

