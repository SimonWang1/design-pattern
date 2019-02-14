package com.wsx.demo.factory.logger.factory;

import com.wsx.demo.factory.logger.abstractfactory.LoggerFactory;
import com.wsx.demo.factory.logger.service.Logger;
import com.wsx.demo.factory.logger.serviceimpl.FileLogger;

// ���幤��
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		Logger logger = new FileLogger();
		// ʡ�Դ����ļ�����
		return logger;
	}
}
