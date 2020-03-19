package com.wsx.demo.fecade.computerabstract.factory;

import com.wsx.demo.fecade.computerabstract.abstractfactory.ComputerModuleFactory;
import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighCPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighDisk;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighGPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighMemory;

// 高配电脑具体工厂
public class HighComputerFactory implements ComputerModuleFactory{

	@Override
	public CPU createCPU() {
		return new HighCPU();
	}

	@Override
	public Disk createDisk() {
		return new HighDisk();
	}

	@Override
	public GPU createGPU() {
		return new HighGPU();
	}

	@Override
	public Memory createMemory() {
		return new HighMemory();
	}
}
