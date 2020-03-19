package com.wsx.demo.fecade.computerabstract.factory;

import com.wsx.demo.fecade.computerabstract.abstractfactory.ComputerModuleFactory;
import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonCPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonDisk;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonGPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonMemory;

// 普通电脑具体工厂
public class CommonComputerFactory implements ComputerModuleFactory{

	@Override
	public CPU createCPU() {
		return new CommonCPU();
	}

	@Override
	public Disk createDisk() {
		return new CommonDisk();
	}

	@Override
	public GPU createGPU() {
		return new CommonGPU();
	}

	@Override
	public Memory createMemory() {
		return new CommonMemory();
	}
}
