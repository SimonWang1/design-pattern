package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.Memory;

// ��ͨ�ڴ�����Ʒ��ҵ��ʵ�֣�
public class CommonMemory implements Memory{
	
	@Override
	public void startup() {
		System.out.println("memory startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("memory shutdown!");
	}
}
