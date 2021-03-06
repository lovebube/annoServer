package kr.ac.uos.ai.annotator.activemq;

import java.util.ArrayList;

public class ActiveMQManager {

	private String mqueueName;
	private Receiver receiver;

	public ActiveMQManager() {
	}

	public void init(String queueName) {
		this.mqueueName = queueName;
		receiver = new Receiver();
		receiver.setQueueName(queueName);
		receiver.init();
		Thread receiverThread = new Thread(receiver);
		receiverThread.start();
	}

	public String getMqueueName() {
		return mqueueName;
	}
	
	public void setMqueueName(String mqueueName) {
		this.mqueueName = mqueueName;
	}
	
}
