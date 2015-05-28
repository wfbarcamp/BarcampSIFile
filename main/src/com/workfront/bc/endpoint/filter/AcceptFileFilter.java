package com.workfront.bc.endpoint.filter;

import org.springframework.integration.annotation.*;

import java.io.*;

/**
 * Created by Garik on 5/24/15.
 */
@MessageEndpoint
public class AcceptFileFilter {

	/**
	 * validates whether file is null or empty
	 */
	@Filter
	public boolean validate(File file) {
		if (file.getName().toLowerCase().endsWith(".exe")) {
			return false;
		}
		return true;
	}
}
