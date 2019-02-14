package com.wsx.demo.factory.logger.abstractfactory;

import com.wsx.demo.factory.logger.service.Logger;

public interface LoggerFactory {
	public Logger createLogger();
}
