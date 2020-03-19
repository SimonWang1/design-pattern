package com.wsx.demo.factory.logger.serviceimpl;

import com.wsx.demo.factory.logger.service.Logger;

// 数据库日志具体产品（业务实现）
public class DatabaseLogger implements Logger{

	@Override
	public void writeLog() {
		System.out.println("record database log");
	}
}
