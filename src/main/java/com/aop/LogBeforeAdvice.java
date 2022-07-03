package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogBeforeAdvice
{
	@Before("execution(* com.aop.service.Bank*.*(..))")
	public void logBefore() 
	{
		System.out.println(".............I WILL EXECUTE BEFORE DEPOSIT METHOD.............");
	}

}
