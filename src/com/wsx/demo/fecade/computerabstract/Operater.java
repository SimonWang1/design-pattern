package com.wsx.demo.fecade.computerabstract;

import com.wsx.demo.fecade.computerabstract.facade.AbstractComputerFacade;
import com.wsx.demo.fecade.computerabstract.factory.ComputerFactory;
import com.wsx.demo.fecade.computerabstract.util.XMLUtil;

public class Operater {
	public static void main(String[] args) {
		AbstractComputerFacade computer = null;
		String computerType = XMLUtil.getComputerType();
		computer = ComputerFactory.getComputerType(computerType);
		computer.open();
		System.out.println("-----------------------------------");
		computer.close();
	}
}
