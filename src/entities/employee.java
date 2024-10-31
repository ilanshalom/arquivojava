package entities;

public class employee implements Comparable <employee> {
 private String name;
 private double salary;
public employee(String name, double salary) {
	
	this.name = name;
	this.salary = salary;
}
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
@Override
public int compareTo(employee other) {
	return name.compareTo(other.getName());
}
 
}
