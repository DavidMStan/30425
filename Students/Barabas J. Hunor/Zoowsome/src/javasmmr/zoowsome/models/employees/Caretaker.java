package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.controllers.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	
	private double workingHours;

	public Caretaker(String name, BigDecimal salary, double workingHours) {
		super(name, salary);
		setWorkingHours(workingHours);
		setIsDead(false);
	}
	
	public Caretaker(){
		 this("Employee", BigDecimal.ZERO, 8);
		 setIsDead(false);
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		if(animal.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		
		if (this.workingHours < animal.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		animal.setTakenCareOf(true);
		setWorkingHours(getWorkingHours()-animal.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
	

}
