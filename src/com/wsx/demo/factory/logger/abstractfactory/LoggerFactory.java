package com.wsx.demo.factory.logger.abstractfactory;

import com.wsx.demo.factory.logger.service.Logger;

// 工厂方法模式，单一抽象工厂，方便拓展
public interface LoggerFactory {
	
	public Logger createLogger();
}
