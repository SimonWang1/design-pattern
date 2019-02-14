package com.wsx.demo.fecade.computerabstract.factory;

import com.wsx.demo.fecade.computerabstract.facade.AbstractComputerFacade;
import com.wsx.demo.fecade.computerabstract.facade.CommonComputer;
import com.wsx.demo.fecade.computerabstract.facade.HighComputer;

public class ComputerFactory {
	public static AbstractComputerFacade getComputerType(String type) {
		AbstractComputerFacade computer = null;
		if (type.equalsIgnoreCase("commonComputer")) {
			computer = new CommonComputer();
		} else if (type.equalsIgnoreCase("highComputer")) {
			computer = new HighComputer();
		}
		return computer;
	}
}
