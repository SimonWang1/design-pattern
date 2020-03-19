package com.wsx.demo.factory.logger.factory;

import com.wsx.demo.factory.logger.abstractfactory.LoggerFactory;
import com.wsx.demo.factory.logger.service.Logger;
import com.wsx.demo.factory.logger.serviceimpl.DatabaseLogger;

// ���ݿ���־���幤��
public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// ʡ���������ݿ����
		// ʡ�Գ�ʼ�����ݿ���־����
		return new DatabaseLogger();
	}
}
