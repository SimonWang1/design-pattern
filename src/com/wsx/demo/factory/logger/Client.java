package com.wsx.demo.factory.logger;

import com.wsx.demo.factory.logger.abstractfactory.LoggerFactory;
import com.wsx.demo.factory.logger.service.Logger;
import com.wsx.demo.factory.logger.util.XMLUtil;

public class Client {
	public static void main(String[] args) {
		LoggerFactory factory = null;
		Logger logger = null;
		//	factory = new FileLoggerFactory();
		factory = (LoggerFactory) XMLUtil.getBean();
		logger = factory.createLogger();
		logger.writeLog();
	}
}
