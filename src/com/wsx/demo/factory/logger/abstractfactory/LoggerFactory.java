package com.wsx.demo.factory.logger.abstractfactory;

import com.wsx.demo.factory.logger.service.Logger;

// ��������ģʽ����һ���󹤳���������չ
public interface LoggerFactory {
	
	public Logger createLogger();
}
