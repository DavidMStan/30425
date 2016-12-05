package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private Boolean isDead;
	private static long x =1000000000000L;
	
	Employee(String name, BigDecimal salary){
		setName(name);
		setId();
		setSalary(salary);
		setIsDead(false);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId() {
		id = x++;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Boolean getIsDead() {
		return isDead;
	}
	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
	
	
}
