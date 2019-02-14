package com.wsx.demo.fecade.computerabstract.facade;

import com.wsx.demo.fecade.computerabstract.service.CPU;
import com.wsx.demo.fecade.computerabstract.service.Disk;
import com.wsx.demo.fecade.computerabstract.service.GPU;
import com.wsx.demo.fecade.computerabstract.service.Memory;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighCPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighDisk;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighGPU;
import com.wsx.demo.fecade.computerabstract.serviceimpl.HighMemory;

// Õ‚π€¿‡
public class HighComputer extends AbstractComputerFacade{
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
		cpu = new HighCPU();
		memory = new HighMemory();
		gpu = new HighGPU();
		disk = new HighDisk();
	}
}
