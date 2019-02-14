package com.wsx.demo.factory.logger.factory;

import com.wsx.demo.factory.logger.abstractfactory.LoggerFactory;
import com.wsx.demo.factory.logger.service.Logger;
import com.wsx.demo.factory.logger.serviceimpl.DatabaseLogger;

// ���幤��
public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// ʡ���������ݿ����
		Logger logger = new DatabaseLogger();
		// ʡ�Գ�ʼ�����ݿ���־����
		return logger;
	}
}
