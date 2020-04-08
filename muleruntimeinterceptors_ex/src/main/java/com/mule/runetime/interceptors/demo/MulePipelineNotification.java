package com.mule.runetime.interceptors.demo;

import org.mule.runtime.api.metadata.TypedValue;
import org.mule.runtime.api.notification.PipelineMessageNotification;
import org.mule.runtime.api.notification.PipelineMessageNotificationListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MulePipelineNotification implements PipelineMessageNotificationListener<PipelineMessageNotification> {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MulePipelineNotification.class);
	
	@Override
	public void onNotification(PipelineMessageNotification notification) {
		
		String transactionId = ((org.mule.extension.http.api.HttpRequestAttributes) notification.getEvent().getMessage().getAttributes().getValue()).getHeaders().get("x-transaction-id").toString();
		
		//Use System.out
		//System.out.println("MulePipelineNotification :: Step :: ==> " + notification );
		//System.out.println("MulePipelineNotification :: Header - Transaction-Id :: ==> " + transactionId );
		
		// or use logger framework to log the required details
		LOGGER.info("MulePipelineNotification :: Step :: ==> " + notification );
		LOGGER.info("MulePipelineNotification :: Header - Transaction-Id :: ==> " + transactionId );
	}
}
