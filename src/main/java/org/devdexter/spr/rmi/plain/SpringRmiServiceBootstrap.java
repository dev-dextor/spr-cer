package org.devdexter.spr.rmi.plain;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiServiceBootstrap {
	
	public static void main(String [] args) throws Exception{
	
		if(true){
			System.setProperty( "javax.net.ssl.keyStore", "keystore" );
			System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
			System.setProperty("javax.net.ssl.trustStore","keystore");					System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		}
	
		
		new  ClassPathXmlApplicationContext(new String [] {"rmi-beans.xml"});
	
		System.out.println("Just bootstrapted the rmi server");
		
	}
}
