package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.Memory;

// 高配内存具体产品（业务实现）
public class HighMemory implements Memory{
	
	@Override
	public void startup() {
		System.out.println("RGB PRO 16GB DDR4 startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("RGB PRO 16GB DDR4 shutdown!");
	}
}
