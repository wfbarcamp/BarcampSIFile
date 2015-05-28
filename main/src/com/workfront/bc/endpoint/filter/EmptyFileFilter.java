package com.workfront.bc.endpoint.filter;

import org.springframework.integration.annotation.*;

import java.io.*;

/**
 * Created by Garik on 5/24/15.
 */
@MessageEndpoint
public class EmptyFileFilter {

	/**
	 * validates whether file is null or empty
	 */
	public boolean validate(File file) {
		if (file == null || file.length() == 0) {
			return false;
		}
		return true;
	}
}
