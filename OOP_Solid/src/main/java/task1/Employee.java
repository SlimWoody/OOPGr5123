package task1;

import java.util.Date;

public class Employee {
    private String name;
    private Date dob;

    public int getBaseSalary() {
        return baseSalary;
    }

    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmplnfo() {
        return "name -" + name + ", dob -" + dob.toString();
    }

}

// public class Employee {
//     private String name;
//     private Date dob;
//     private int baseSalary;

//     public Employee(String name, Date dob, int baseSalary) {
//         this.name = name;
//         this.dob = dob;
//         this.baseSalary = baseSalary;
//     }

//     public String getEmpInfo() {
//         return "name - " + name + " , dob - " + dob.toString();
//     }

//     public int calculateNetSalary() {
//         int tax = (int) (baseSalary * 0.25);// calculate in otherway
//         return baseSalary - tax;
//     }
// }