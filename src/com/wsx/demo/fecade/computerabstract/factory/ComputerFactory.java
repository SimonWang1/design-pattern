package com.wsx.demo.fecade.computerabstract.factory;

import com.wsx.demo.fecade.computerabstract.facade.AbstractComputerFacade;
import com.wsx.demo.fecade.computerabstract.facade.CommonComputer;
import com.wsx.demo.fecade.computerabstract.facade.HighComputer;

// �򵥹�����������������ѡ��
public class ComputerFactory {
	
	public static AbstractComputerFacade getComputerType(String type) {
		if (type.equalsIgnoreCase("commonComputer")) {
			return new CommonComputer();
		}
		if (type.equalsIgnoreCase("highComputer")) {
			return new HighComputer();
		}
		return null;
	}
	
	private ComputerFactory() {}
}
