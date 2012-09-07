package org.devdexter.spr.rmi.plain;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class PlainClient {

	private static String host = "localhost";
	private static String port = "1099";
	private static Boolean useSecurityManager = false;
	private static String messagingServiceName = "//localhost:1099/ServiceBean";
	
	public static void main(String[] args) {
		
		
		if ( useSecurityManager && System.getSecurityManager() == null){
			System.setSecurityManager( new RMISecurityManager());
		}
		
		
		System.out.println("scaning for services....");
		try {
			String[] services = Naming.list("//" + host + ":" + port + "/");
			for (String srv : services){
				System.out.println( srv );
			}
			
		} catch (RemoteException e) {
			
			System.out.println("bad url");
			e.printStackTrace();
		} catch (MalformedURLException e) {

			System.out.println("bad url");
			e.printStackTrace();
		}
		
		try {
			MessagingService messaging = (MessagingService) Naming.lookup(messagingServiceName);
			
			String text = messaging.getMessage().getMessageBody();
			System.out.println("texto message = " + text);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
