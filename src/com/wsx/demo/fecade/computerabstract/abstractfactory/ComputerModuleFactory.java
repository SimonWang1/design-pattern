package com.wsx.demo.fecade.computerabstract.abstractfactory;

import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;

public interface ComputerModuleFactory {
	public CPU createCPU();
	
	public Disk createDisk();
	
	public GPU createGPU();
	
	public Memory createMemory();
}
