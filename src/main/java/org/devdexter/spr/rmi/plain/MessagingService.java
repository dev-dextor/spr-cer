package org.devdexter.spr.rmi.plain;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessagingService extends Remote{
	
	Message getMessage() throws RemoteException;

}
