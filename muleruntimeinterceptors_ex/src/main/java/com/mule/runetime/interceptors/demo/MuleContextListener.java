package com.mule.runetime.interceptors.demo;

import org.mule.runtime.core.api.context.notification.MuleContextNotification;
import org.mule.runtime.core.api.context.notification.MuleContextNotificationListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuleContextListener implements MuleContextNotificationListener<MuleContextNotification> {

	
    private static Logger LOGGER = LoggerFactory.getLogger(MuleContextListener.class);
	
	@Override
	public void onNotification(MuleContextNotification muleContext) {
		
        //Use System.out
    	//System.out.println("Mule Context :" + muleContext);
        // or use logger framework to log the required details
		LOGGER.info("Mule Context :" + muleContext);
		
	}
	

}
