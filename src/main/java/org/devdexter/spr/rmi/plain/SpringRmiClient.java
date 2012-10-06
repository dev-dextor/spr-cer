package org.devdexter.spr.rmi.plain;

import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext(new String [] 
				
				{ "test.xml" /*,"client-rmi-beans.xml"*/ }
		);
		
		System.out.println("Just starting the spring rmi client");
		
		MessagingService service = (MessagingService) context.getBean("clientServiceProxy");
		
		try {
			String text = service.getMessage().getMessageBody();
			System.out.println("texto = " + text);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
