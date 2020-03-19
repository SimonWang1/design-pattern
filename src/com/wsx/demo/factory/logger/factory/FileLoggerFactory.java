package com.wsx.demo.factory.logger.factory;

import com.wsx.demo.factory.logger.abstractfactory.LoggerFactory;
import com.wsx.demo.factory.logger.service.Logger;
import com.wsx.demo.factory.logger.serviceimpl.FileLogger;

// �ļ���־���幤��
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// ʡ�Դ����ļ�����
		return new FileLogger();
	}
}
