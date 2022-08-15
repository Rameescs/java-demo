package RandomWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeAge {

	public static void main(String[] args) {
		
		
       List<Employee>  employees  = Arrays.asList(
               new Employee("George", 10),
               new Employee("Robert", 12),
               new Employee("Kathy", 34)
           );
       
       Comparator<Employee> sortByAge = (e1,e2)->Integer.compare(e1.getAge(), e2.getAge());
       employees.stream().sorted(sortByAge).forEach(e->System.out.println(e.getName()));
       System.out.println("\nLowets Age");
       System.out.println(employees.stream().mapToInt(Employee::getAge).min());
       Employee minEmpAge= employees.stream().min(Comparator.comparingInt(Employee::getAge)).get();
       System.out.println("User with minimum age: " + minEmpAge);
       
       
       
	}
	

}

 class Employee{
	
  String name;
  public Employee(String name,int age) {
	super();
	this.name = name;
	this.age = age;
}
int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
    return "[" + name + ", " + String.valueOf(age) + "]";
}
  

}
