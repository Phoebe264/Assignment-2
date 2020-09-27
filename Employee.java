/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author litong
 */
class Employee {

    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;

    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        this.name = name;
    }
    
    public void raiseSalary(double byPercent){
    salary = ((byPercent/100)*salary);
    }
    
    enum Gender {

        MALE,
        FEMALE;
    }

}

