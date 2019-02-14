package com.wsx.demo.fecade.computerabstract.facade;

//import com.wsx.demo.fecade.computerabstract.abstractfactory.ComputerModuleFactory;
import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonCPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonDisk;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonGPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.CommonMemory;

// Õ‚π€¿‡
public class CommonComputer extends AbstractComputerFacade{
//	private ComputerModuleFactory moduleFactory = null;
	private CPU cpu = null;
	private Memory memory = null;
	private GPU gpu = null;
	private Disk disk = null;
	
	@Override
	public void open() {
		System.out.println("start the common computer!");
		cpu.startup();
		memory.startup();
		gpu.startup();
		disk.startup();
		System.out.println("start the computer finished!");
	}
	
	@Override
	public void close() {
		System.out.println("begin to close the common computer!");
		cpu.shutdown();
		memory.shutdown();
		gpu.startup();
		disk.shutdown();
		System.out.println("computer closed!");
	}
	
	public CommonComputer() {
		cpu = new CommonCPU();
		memory = new CommonMemory();
		gpu = new CommonGPU();
		disk = new CommonDisk();
	}
}
