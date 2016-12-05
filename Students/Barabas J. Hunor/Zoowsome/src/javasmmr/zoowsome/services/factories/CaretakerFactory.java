package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeAbstractFactory {


	public Employee getEmployee(String type) {
		if(Constants.Employees.CARETAKER.equals(type)){
			return new Caretaker();
		}else{
			throw new RuntimeException("Invalid animal exception!");
		}
		
	}

}
 