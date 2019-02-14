package com.wsx.demo.fecade.computerabstract.facade;

import com.wsx.demo.fecade.computerabstract.abstractfactory.ComputerModuleFactory;
import com.wsx.demo.fecade.computerabstract.factory.HighComputerFactory;
import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;

// 外观类
public class HighComputer extends AbstractComputerFacade{
	private ComputerModuleFactory moduleFactory = null;
	private CPU cpu = null;
	private Memory memory = null;
	private GPU gpu = null;
	private Disk disk = null;
	
	@Override
	public void open() {
		System.out.println("start the high configuration computer!");
		cpu.startup();
		memory.startup();
		gpu.startup();
		disk.startup();
		System.out.println("start the computer finished!");
	}
	
	@Override
	public void close() {
		System.out.println("begin to close the high configuration computer!");
		cpu.shutdown();
		memory.shutdown();
		gpu.startup();
		disk.shutdown();
		System.out.println("computer closed!");
	}
	
	public HighComputer() {
		// 使用工厂类创建对象
		moduleFactory = new HighComputerFactory();
		cpu = moduleFactory.createCPU();
		memory = moduleFactory .createMemory();
		gpu = moduleFactory.createGPU();
		disk = moduleFactory.createDisk();
	}
}
