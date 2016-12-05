package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
	
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	Random randomId = new Random();
	
	public Employee(String name, long id, BigDecimal salary){
		setName(name);
		setId(id);
		setSalary(salary);
		setIsDead(false);	
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(long id){
		id = randomId.nextLong();
	}
	public long getId(){
		return id;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary ;
	}
	public boolean getIsDead(){
		return isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead ;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	
}
