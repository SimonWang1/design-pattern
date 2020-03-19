package com.wsx.demo.factory.logger.factory;

import com.wsx.demo.factory.logger.abstractfactory.LoggerFactory;
import com.wsx.demo.factory.logger.service.Logger;
import com.wsx.demo.factory.logger.serviceimpl.DatabaseLogger;

// 数据库日志具体工厂
public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// 省略连接数据库代码
		// 省略初始化数据库日志代码
		return new DatabaseLogger();
	}
}
