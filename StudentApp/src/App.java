import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domen.Employee;
import Domen.PersonComporator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 27);
        Student s4 = new Student("Игорь", 21);
        Student s5 = new Student("Даша", 25);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Дмитрий", 26);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        List<Student> listStud2 = new ArrayList<>();
        listStud2.add(s3);
        listStud2.add(s4);
        listStud2.add(s5);
        List<Student> listStud3 = new ArrayList<>();
        listStud3.add(s6);
        listStud3.add(s7);

        System.out.println();
        System.out.println("*           * Список групп *           *");
        System.out.println();

        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        System.out.println(group4580);
        StudentGroup group5123 = new StudentGroup(listStud2, 5123);
        System.out.println(group5123);
        StudentGroup group5173 = new StudentGroup(listStud3, 5173);
        System.out.println(group5173);

        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        System.out.println("Группа 4580");
        System.out.println();
        Collections.sort(group4580.getGroup());
        System.out.println();
        System.out.println("Группа 5123");
        System.out.println();
        Collections.sort(group5123.getGroup());
        System.out.println();
        System.out.println("Группа 5173");
        System.out.println();
        Collections.sort(group5173.getGroup());
        System.out.println();

        System.out.println("===========================================");

        System.out.println("Группа 4580");
        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }

        System.out.println("Группа 5123");
        for (Student std : group5123.getGroup()) {
            System.out.println(std);
        }

        System.out.println("Группа 5173");
        for (Student std : group5173.getGroup()) {
            System.out.println(std);
        }
        System.out.println("===========================================");
        System.out.println("");
        System.out.println("*** Список потока ***");
        System.out.println("");
        List<StudentGroup> listGroup1 = new ArrayList<StudentGroup>();
        listGroup1.add(group4580);
        listGroup1.add(group5123);
        listGroup1.add(group5173);

        StudentStream stream1 = new StudentStream(listGroup1, 1);
        System.out.println(stream1);
        System.out.println("");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("*** Список потока по группам ***");
        System.out.println();
        for (StudentGroup std : stream1.getStream()) {
            System.out.println(std);
        }
        System.out.println("===========================================");
        System.out.println();
        System.out.println("***  Сортировка в потоке по количеству студентов в группе ***      *");
        System.out.println();

        Collections.sort(stream1.getStream());
        for (StudentGroup std : stream1.getStream()) {
            System.out.println(std);
        }

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Надежда", 57, "Docent");
        Teacher t3 = new Teacher("Михаил", 67, "Docent");
        Teacher t4 = new Teacher("Дмитрий", 83, "Docent");

        List<Teacher> listTeachers1 = new ArrayList<Teacher>();
        listTeachers1.add(t1);
        listTeachers1.add(t2);
        listTeachers1.add(t3);
        listTeachers1.add(t4);

        Employee Em1 = new Employee("Дмитрий", 49, "Сантехник");
        Employee Em2 = new Employee("Виталий", 58, "Дворник");
        Employee Em3 = new Employee("Анна", 38, "Уборщица");

        List<Employee> listEmployees1 = new ArrayList<Employee>();
        listEmployees1.add(Em1);
        listEmployees1.add(Em2);
        listEmployees1.add(Em3);

        System.out.println(new PersonComporator<Student>().compare(s1, s3));
        System.out.println(new PersonComporator<Teacher>().compare(t1, t2));

        AccountController controller = new AccountController();
        controller.paySalary(t1, 50000);

        /**
         * Вывел результат работы класса averageAge на консоль.
         * 
         */
        int averageAgeOfStudents = AccountController.averageAge(listStud2);
        System.out.println("Средний возраст студентов из группы №4580 - " + averageAgeOfStudents + " лет");

        int averageAgeOfTeachers = AccountController.averageAge(listTeachers1);
        System.out.println("Средний возраст учителей - " + averageAgeOfTeachers + " лет");

        int averageAgeOfEmployee = AccountController.averageAge(listEmployees1);
        System.out.println("Средний возраст персонала - " + averageAgeOfEmployee + " лет");

    }
}
