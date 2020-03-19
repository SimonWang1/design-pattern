package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.GPU;

// 普通显卡具体产品（业务实现）
public class CommonGPU implements GPU{
	
	@Override
	public void startup() {
		System.out.println("gpu startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("gpu shutdown!");
	}
}
