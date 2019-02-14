package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.CPU;

public class CommonCPU implements CPU{
	@Override
	public void startup() {
		System.out.println("cpu startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("cpu shutdown!");
	}
}
