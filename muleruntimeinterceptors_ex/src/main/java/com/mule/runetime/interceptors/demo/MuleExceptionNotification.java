package com.mule.runetime.interceptors.demo;

import org.mule.runtime.api.notification.ExceptionNotification;
import org.mule.runtime.api.notification.ExceptionNotificationListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuleExceptionNotification implements ExceptionNotificationListener {

	private static Logger LOGGER = LoggerFactory.getLogger(MuleExceptionNotification.class);
	
	@Override
	public void onNotification(ExceptionNotification notification) {
		
		String transactionId = ((org.mule.extension.http.api.HttpRequestAttributes) notification.getEvent().getMessage().getAttributes().getValue()).getHeaders().get("x-transaction-id").toString();

		LOGGER.error("Transaction-Id:" + transactionId + 
				"\n ActionName: " + notification.getActionName() + 
				"\n Server Name: " + notification.getServerId() + 
				"\n Timestamp: " + notification.getTimestamp());		
	}

}
