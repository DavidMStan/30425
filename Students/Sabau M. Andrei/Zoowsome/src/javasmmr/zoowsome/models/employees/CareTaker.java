package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import java.math.BigDecimal;

public class CareTaker extends Employee implements Caretaker_I  {

	private double workingHours;
	
	public CareTaker(String name, BigDecimal salary, boolean isDead, double workingHours){
		super(name, salary, isDead);
		setWorkingHours(workingHours);
	}
	
	public CareTaker(){
		this("Employee", BigDecimal.ZERO, false, 8);//at least 8 hours/week can a caretaker work
	}
	
	public double getWorkingHours(){
		return workingHours;
	}
	
	public void setWorkingHours(double workingHours){
		this.workingHours = workingHours;
	}
	
	public String takeCareOf(Animal animal){
		if(animal.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		
		if(this.workingHours < animal.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}
}
