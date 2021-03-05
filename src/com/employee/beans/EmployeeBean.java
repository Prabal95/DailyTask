package com.employee.beans;

public class EmployeeBean {

	private int id;
	private String name,age,salary,city,mob,email,gender;
	
	public EmployeeBean(int id, String name,String age, String salary, String city, String mob, String email, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.mob = mob;
		this.email = email;
		this.gender = gender;
	}
	
	public EmployeeBean(String name,String age, String salary, String city, String mob, String email, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.mob = mob;
		this.email = email;
		this.gender = gender;
	}
	
	public EmployeeBean(int id) {
		super();
		this.id = id;
	}
	
	 public EmployeeBean() {
		 super();
	 }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
