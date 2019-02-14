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

public class CommonComputerFactory implements ComputerModuleFactory{

	@Override
	public CPU createCPU() {
		CPU cpu = new CommonCPU();
		return cpu;
	}

	@Override
	public Disk createDisk() {
		Disk disk = new CommonDisk();
		return disk;
	}

	@Override
	public GPU createGPU() {
		GPU gpu = new CommonGPU();
		return gpu;
	}

	@Override
	public Memory createMemory() {
		Memory memory = new CommonMemory();
		return memory;
	}
}
