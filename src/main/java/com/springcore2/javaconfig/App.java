package com.springcore2.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        
        Student std = ctx.getBean("std1",Student.class);
        
        System.out.println(std);
        std.study();
       
    }
}
//output:Hello World!
//com.springcore2.javaconfig.Student@483f6d77
//student is reading book
