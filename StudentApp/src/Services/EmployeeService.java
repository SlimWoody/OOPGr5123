package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComporator;
import Domen.Student;

public class EmployeeService implements iPersonService<Employee> {

    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee empls = new Employee(name, age, "basic");
        count++;
        employees.add(empls);
    }

    public void SortByFIO() {
        PersonComporator<Employee> persComp = new PersonComporator<Employee>();
        employees.sort(persComp);
    }
}
