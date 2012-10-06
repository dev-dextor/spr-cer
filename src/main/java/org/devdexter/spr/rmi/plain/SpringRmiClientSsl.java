package org.devdexter.spr.rmi.plain;

import java.rmi.RemoteException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiClientSsl {
	
	public static void main(String[] args) {
	
	
		if(true){
			System.setProperty( "javax.net.ssl.keyStore", "keystore" );
			System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
			System.setProperty("javax.net.ssl.trustStore","keystore");					System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		}
	
	
		
		ApplicationContext context = new  ClassPathXmlApplicationContext(new String [] 
				
				{ "test-ssl-client.xml" /*,"client-rmi-beans.xml"*/ }
		);
		
		System.out.println("Just starting the spring rmi client over SSL");
		
		MessagingService service = (MessagingService) context.getBean("clientServiceProxySsl");
		
		try {
			String text = service.getMessage().getMessageBody();
			System.out.println("texto = " + text);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
