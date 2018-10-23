package com.cg.SpringOne.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.SpringOne.service.Mobile;
import com.cg.SpringOne.service.Shape;

public class MyApplication
{
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
	ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
	
//	Shape sp=(Shape) app.getBean("cir");
//	sp.getShape();
	
//	
	Mobile mobile=(Mobile) app.getBean("mob");
//	mobile.setMobId(100);
//	mobile.setMobName("LG");
//	mobile.getAllDetail();
//	
	
	System.out.println("enter the mobId");
	int mobId=s.nextInt();
	mobile.setMobId(mobId);
	
	System.out.println("enter the mobName");
	String mobN=s.next();
	mobile.setMobName(mobN);
	
	mobile.getAllDetail();
}
}
