package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.GPU;

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
