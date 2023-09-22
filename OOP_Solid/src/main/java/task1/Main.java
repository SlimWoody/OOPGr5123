package task1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Employee employee = new Employee("Paul",date, 60000);
        CalculateNetSalary calculateNetSalary = new CalculateNetSalary();
        System.out.println(calculateNetSalary.calculateNetSalary(employee));
    }
}