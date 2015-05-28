package com.workfront.bc;

import org.apache.log4j.*;
import org.springframework.context.support.*;

public class Application {

	public static void main(String[] args) {

		// PropertyConfigurator.configure(
		//	ClassLoader.getSystemResource("log4j.xml"));

		new ClassPathXmlApplicationContext(
			"applicationContext.xml"
		);
	}
}
