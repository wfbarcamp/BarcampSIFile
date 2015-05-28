package com.workfront.bc.endpoint.service;

import org.apache.log4j.*;
import org.springframework.integration.annotation.*;
import org.springframework.messaging.*;

import java.io.*;

@MessageEndpoint
public class ServiceActivatorLogger {

	private Logger logger = Logger.getLogger("Tracker");

	@ServiceActivator(inputChannel = "loggerChannel")
	public void log(Message<File> message) {
		logger.info(message);
	}
}
