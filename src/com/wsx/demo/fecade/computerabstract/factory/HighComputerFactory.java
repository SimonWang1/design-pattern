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

// 具体工厂
public class HighComputerFactory implements ComputerModuleFactory{

	@Override
	public CPU createCPU() {
		CPU cpu = new HighCPU();
		return cpu;
	}

	@Override
	public Disk createDisk() {
		Disk disk = new HighDisk();
		return disk;
	}

	@Override
	public GPU createGPU() {
		GPU gpu = new HighGPU();
		return gpu;
	}

	@Override
	public Memory createMemory() {
		Memory memory = new HighMemory();
		return memory;
	}
}
