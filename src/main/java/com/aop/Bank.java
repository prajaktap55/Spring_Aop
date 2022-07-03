package com.aop;

import org.springframework.stereotype.Service;

@Service

public class Bank 
{

	public String deposit(String accountNumber)  
	{
		String s1 ="success";
		System.out.println("inside deposit() method!..");

		if (accountNumber.equals("YES123"))
		{

			System.out.println("You have successfully deposited... ");
		}
		return s1; 
	}

}
