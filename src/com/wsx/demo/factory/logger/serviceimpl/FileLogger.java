package com.wsx.demo.factory.logger.serviceimpl;

import com.wsx.demo.factory.logger.service.Logger;

// 文件日志具体实现（业务实现）
public class FileLogger implements Logger{

	@Override
	public void writeLog() {
		System.out.println("record file log");
	}
}
