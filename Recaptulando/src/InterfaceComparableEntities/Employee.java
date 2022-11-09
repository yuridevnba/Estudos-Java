package InterfaceComparableEntities;

public class Employee implements Comparable<Employee> {
	
private String name;
private double salary;


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}


public Employee(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}


@Override
public int compareTo(Employee other) {
	// TODO Auto-generated method stub
	return name.compareTo(other.getName());
}


}
