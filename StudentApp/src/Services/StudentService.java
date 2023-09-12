package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComporator;
import Domen.Student;

public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;

    public StudentService(){
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
    }

    public void SortByFIO()
    {
        PersonComporator<Student> studComp = new PersonComporator<Student>();
        students.sort(studComp);
    }
}