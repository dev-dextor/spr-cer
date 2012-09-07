package org.devdexter.spr.rmi.plain;

import java.rmi.RemoteException;

public class MessagingServiceImpl implements MessagingService {

	public Message getMessage() throws RemoteException {
		
		return new Message();
	}

}
