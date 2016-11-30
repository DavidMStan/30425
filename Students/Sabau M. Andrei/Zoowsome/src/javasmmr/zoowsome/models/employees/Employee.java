package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;

public abstract class Employee {

	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	private static int counter = 0;
	
	public Employee(String name, BigDecimal salary, boolean isDead){
		setName(name + counter);//to differentiate the caretakers
		++counter;
		
		setId();
		setSalary(salary);
		setIsDead(isDead);
	}
	 
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(){
		long nr = (long) (((double) 1e14 )* Math.random()) ;
		
		int nrOfDigits = 0;
		long copyOfNr = nr;
		
		while(copyOfNr > 0){
			nrOfDigits++;
			copyOfNr /= 10;
		}
		
		if(nrOfDigits == 13)
			this.id = nr;
		else 
			this.id = nr/10;
			
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
