package com.wsx.demo.fecade.computerabstract.abstractfactory;

import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;

// 抽象工厂方法模式，抽象二维工厂，方便拓展
public interface ComputerModuleFactory {
	
	public CPU createCPU();
	
	public Disk createDisk();
	
	public GPU createGPU();
	
	public Memory createMemory();
}
