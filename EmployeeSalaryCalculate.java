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
public class EmployeeSalaryCalculate {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and
     * print it. If the salary is less than or equal to 8900, the Social
     * Security Tax is 6.2% of the salary. If the salary is more than 8900, the
     * Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        if (employee.salary <= 8900) {
            return ((6.2 / 100) * employee.salary);
        } else {
            return ((6.2 / 100) * 106800);
        }
    }

    /**
     * Write a method to calculate an employee's contribution for insurance
     * coverage and print it. Amount of deduction is computed as follows: If the
     * employee is under 35, rate is 3% of salary; if the employee is between 35
     * and 50(inclusive), rate is 4% of salary; If the employee is between 50
     * and 60(exclusive), rate is 5% of salary; If the employee is above 60,
     * rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
        if (employee.age < 35) {
            return ((3 / 100) * employee.salary);
        } else if (employee.age >= 35 && employee.age <= 50) {
            return ((4 / 100) * employee.salary);
        } else if (employee.age > 50 && employee.age < 60) {
            return ((5 / 100) * employee.salary);
        } else {
            return ((6 / 100) * employee.salary);
        }
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then
     * print their name in order. For example, Alice's salary is 1000, John's
     * salary is 500, Jenny's salary is 1200, you should print: John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        if (e1.salary > e3.salary) {
            Employee temp = e1;
            e1 = e3;
            e3 = temp;
        }

        if (e1.salary > e2.salary) {
            Employee temp = e1;
            e1 = e2;
            e2 = temp;
        }

        if (e2.salary > e3.salary) {
            Employee temp = e2;
            e2 = e3;
            e3 = temp;
        }

        System.out.println(e1.name + " " + e2.name + " " + e3.name);
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her
     * original salary. Eg: original salary was 1000/month. After using this
     * method, the salary is 3000/month. Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double
     * byPercent)
     */
    public void tripleSalary(Employee employee) {
        employee.salary*=3;
    }
    

    //Extra credit
    /**
     * I have written some code below. What I want is to swap two Employee
     * objects. One is Jenny and one is John. But after running it, I got the
     * result below: Before: a=Jenny Before: b=John After: a=Jenny After: b=John
     * There is no change after swap()! Do you know the reason why my swap
     * failed? Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Employee.Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Employee.Gender.MALE, 2500);
        Employee c = new Employee("Alice", 35, Employee.Gender.FEMALE, 1500);

        sortSalary(a, b, c);

    }
    
    //This method is static , it canot swap non static objects
    
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}