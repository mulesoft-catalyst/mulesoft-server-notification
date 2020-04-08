package com.mule.runetime.interceptors.demo;

import org.mule.runtime.api.notification.FlowConstructNotification;
import org.mule.runtime.api.notification.FlowConstructNotificationListener;
import org.mule.runtime.api.notification.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlowConstructionListener implements FlowConstructNotificationListener<FlowConstructNotification> {

    private static Logger LOGGER = LoggerFactory.getLogger(FlowConstructionListener.class);

	@Override
	public void onNotification(FlowConstructNotification notification) {
		//Use System.out
		//System.out.println("FlowConstructNotification  :: Step :: ==> " +  notification)	;
		// or use logger framework to log the required details
		LOGGER.info("FlowConstructNotification  :: Step :: ==> " + notification);
		
	}

	

}
