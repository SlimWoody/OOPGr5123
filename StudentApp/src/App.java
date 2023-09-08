import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 27);
        Student s4 = new Student("Игорь",  21);
        Student s5 = new Student("Даша",  25);
        Student s6 = new Student("Лена",  23);
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

        for(Student std : group4580)
        {
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
        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        System.out.println("Группа 5123");
        for(Student std: group5123.getGroup())
        {
            System.out.println(std);
        }

        System.out.println("Группа 5173");
        for(Student std: group5173.getGroup())
        {
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
        for(StudentGroup std: stream1.getStream())
        {
            System.out.println(std);
        }
        System.out.println("===========================================");
        System.out.println();
        System.out.println("***  Сортировка в потоке по количеству студентов в группе ***      *");
        System.out.println();
    
        Collections.sort(stream1.getStream());
        for(StudentGroup std: stream1.getStream())
        {
            System.out.println(std);
        }
    }
}
