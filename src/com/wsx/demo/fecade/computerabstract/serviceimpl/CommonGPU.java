package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.GPU;

// ��ͨ�Կ������Ʒ��ҵ��ʵ�֣�
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
