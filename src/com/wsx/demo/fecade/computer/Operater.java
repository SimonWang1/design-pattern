package com.wsx.demo.fecade.computer;

// 修改逻辑需要改代码，不满足开闭原则
public class Operater {
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		System.out.println("-----------------------------------");
		computer.shutdown();
	}
}
