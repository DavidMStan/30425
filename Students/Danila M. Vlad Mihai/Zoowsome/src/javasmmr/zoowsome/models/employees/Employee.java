package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import java.util.*;

public abstract class Employee {
	private String name;
	private Long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee(String name, BigDecimal salary, boolean isDead){
		setId();
		setSalary(salary);
		setIsDead(isDead);
		
	}
	public long getId(){
		return id;
	}
	public void setId(){
	Random rand = new Random();
	char[] digit = new char[13];
	digit[0] = (char)(rand.nextInt(10));
	
	for(int i=0;i<13;i++){
		digit[i] = (char)(rand.nextInt(10));
	}
	long id = Long.parseLong(new String(digit));
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}

}
