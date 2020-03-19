package com.wsx.demo.fecade.computerabstract.facade;

import com.wsx.demo.fecade.computerabstract.abstractfactory.ComputerModuleFactory;
import com.wsx.demo.fecade.computerabstract.factory.CommonComputerFactory;
import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;

// 外观类
public class CommonComputer extends AbstractComputerFacade{
	
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
		// 使用工厂类创建对象
		ComputerModuleFactory moduleFactory = new CommonComputerFactory();
		cpu = moduleFactory.createCPU();
		memory = moduleFactory.createMemory();
		gpu = moduleFactory.createGPU();
		disk = moduleFactory.createDisk();
		/* 直接创建对象
		cpu = new CommonCPU();
		memory = new CommonMemory();
		gpu = new CommonGPU();
		disk = new CommonDisk();*/
	}
}
