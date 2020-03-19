package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.CPU;

// 高配CPU具体产品（业务实现）
public class HighCPU implements CPU{
	
	@Override
	public void startup() {
		System.out.println("INTER CORE i9-9980XE startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("INTER CORE i9-9980XE shutdown!");
	}
}
