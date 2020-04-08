package com.mule.runetime.interceptors.demo;

import org.mule.runtime.api.notification.MessageProcessorNotification;
import org.mule.runtime.api.notification.MessageProcessorNotificationListener;
import org.mule.runtime.core.api.context.notification.MuleContextNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuleMessageListener implements MessageProcessorNotificationListener<MessageProcessorNotification> {
	
    private static Logger LOGGER = LoggerFactory.getLogger(MuleMessageListener.class);
    
    @Override
	public void onNotification(MessageProcessorNotification notification) {
			//Use System.out
    			//System.out.println("Message Listener :" + notification);
    			// or use logger framework to log the required details
			LOGGER.info("Message Listener :" + notification);
	}
}