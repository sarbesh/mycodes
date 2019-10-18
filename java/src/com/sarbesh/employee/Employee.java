package com.sarbesh.employee;

public class Employee{
    private long id;
    private int age;
    private long salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(long id, int age, long salary) {    //constructor
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {     //default constructor
    }

    public Employee(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
