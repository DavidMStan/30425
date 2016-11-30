package javasmmr.zoowsome.services.factories.employeeFactories;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;

public class CareTakerFactory extends EmployeeFactory{

	public Employee getEmployeeFactory(String type) throws Exception{
		if(Constants.Employees.CARETAKER.equals(type))
			return new CareTaker();
		else
			throw new Exception("Invalid employee specification");
	}
}

