package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.GPU;

// 高配显卡具体产品（业务实现）
public class HighGPU implements GPU{
	
	@Override
	public void startup() {
		System.out.println("NVIDIA RTX 2080 Ti startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("NVIDIA RTX 2080 Ti shutdown!");
	}
}
