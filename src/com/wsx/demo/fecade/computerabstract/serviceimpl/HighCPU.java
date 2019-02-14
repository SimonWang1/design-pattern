package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.CPU;

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
