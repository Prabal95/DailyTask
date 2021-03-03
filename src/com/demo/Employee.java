package com.demo;


public class Employee {

    private int id;
    private String name,age,salary,city,mob,email,gen;

    public Employee(int id, String name, String age, String salary, String city, String mob, String email, String gen) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
        this.mob = mob;
        this.email = email;
        this.gen = gen;
    }

    public Employee(String name, String age, String salary, String city, String mob, String email, String gen) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
        this.mob = mob;
        this.email = email;
        this.gen = gen;
    }

//    public Employee(int id) {
//        this.id = id;
//    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
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

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", city='" + city + '\'' +
                ", mob='" + mob + '\'' +
                ", email='" + email + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
