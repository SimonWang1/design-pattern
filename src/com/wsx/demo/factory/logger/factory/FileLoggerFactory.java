package com.wsx.demo.factory.logger.factory;

import com.wsx.demo.factory.logger.abstractfactory.LoggerFactory;
import com.wsx.demo.factory.logger.service.Logger;
import com.wsx.demo.factory.logger.serviceimpl.FileLogger;

// 具体工厂
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		Logger logger = new FileLogger();
		// 省略创建文件代码
		return logger;
	}
}
