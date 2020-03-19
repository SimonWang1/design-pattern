package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.Memory;

// 普通内存具体产品（业务实现）
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
