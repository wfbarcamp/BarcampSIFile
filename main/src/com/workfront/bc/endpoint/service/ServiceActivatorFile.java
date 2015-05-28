package com.workfront.bc.endpoint.service;

import org.apache.commons.io.*;
import org.springframework.integration.annotation.*;

import java.io.*;

@MessageEndpoint
public class ServiceActivatorFile {

	@ServiceActivator(inputChannel = "outputChannel")
	public File service(File file) {

		if (file.length() > 0) {
			return file;
		}

		try {
			FileUtils.forceDelete(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
