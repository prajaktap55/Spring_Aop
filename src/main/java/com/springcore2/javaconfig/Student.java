package com.springcore2.javaconfig;
import org.springframework.stereotype.Component;

@Component("std1")
public class Student 
{
	public void study()
	{
		System.out.println("student is reading book");
	}
	

}
