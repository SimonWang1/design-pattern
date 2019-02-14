package com.wsx.demo.factory.logger.serviceimpl;

import com.wsx.demo.factory.logger.service.Logger;

public class DatabaseLogger implements Logger{

	@Override
	public void writeLog() {
		System.out.println("record database log");
	}
}
