package org.devdexter.spr.rmi.plain;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiServiceBootstrap {
	
	public static void main(String [] args) throws Exception{
	
		new  ClassPathXmlApplicationContext(new String [] {"rmi-beans.xml"});
	
		System.out.println("Just bootstrapted the rmi server");
		
	}
}
