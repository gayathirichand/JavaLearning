package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		
		
		messenger.sendMail("Hello !!! You will receive only message");
		messenger.sendMail("Hello !!! You will receive message"," with Name");
		messenger.sendMail("Hello !!! You will receive message"," with Name"," and Subject");

	}

}
