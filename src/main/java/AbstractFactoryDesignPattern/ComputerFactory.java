package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Computer.Computer;
import AbstractFactoryDesignPattern.Factory.ComputerAbstractFactory;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
