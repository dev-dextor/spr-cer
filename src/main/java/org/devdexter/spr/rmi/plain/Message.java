package org.devdexter.spr.rmi.plain;

import java.io.Serializable;

public class Message implements Serializable {
	
	private String messageBody = "Hello Message for Rmi tests";
	
	public String getMessageBody(){
		return this.messageBody;
	}

}
