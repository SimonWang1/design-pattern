package com.wsx.demo.factory.logger.serviceimpl;

import com.wsx.demo.factory.logger.service.Logger;

// �ļ���־����ʵ�֣�ҵ��ʵ�֣�
public class FileLogger implements Logger{

	@Override
	public void writeLog() {
		System.out.println("record file log");
	}
}
