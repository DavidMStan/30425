package javasmmr.zoowsome.services.factories.employeeFactories;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;

public class CareTakerFactory extends EmployeeFactory{

	public Employee getEmployeeFactory(String type) throws Exception{
		if(Constants.Employees.CARETAKER.equals(type)){
			CareTaker caretaker = new CareTaker();
			
			long nrOfDigitsOfId = Utiles.nrOfDigits(caretaker.getId());
			
			if(nrOfDigitsOfId == 14){//if the id is 14 digits long then we have to make it to be only 13 digits long
				caretaker.setId(caretaker.getId()/10);
			}
			
			return caretaker;
		}
		else{
			throw new Exception("Invalid employee specification");
		}
	}
}

