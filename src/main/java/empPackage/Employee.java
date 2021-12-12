package empPackage;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	private int empid;
	private String name;
	private Address add;
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public void displayStudentInfo()
	{
		System.out.println("Empid is : " + empid + " and EmpName is : " + name + ". My address is : " + add.getCity() + "," + add.getState() + "," + add.getCountry());
	}
	

}
