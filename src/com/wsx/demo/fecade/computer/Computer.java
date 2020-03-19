package com.wsx.demo.fecade.computer;

// Œ¥∏ƒ‘Ï«∞
public class Computer {
	
	private CPU cpu = null;
	
	private Memory memory = null;
	
	private Disk disk = null;
	
	public void startup() {
		System.out.println("start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start the computer finished!");
	}
	
	public void shutdown() {
		System.out.println("begin to close the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer closed!");
	}
	
	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
}
