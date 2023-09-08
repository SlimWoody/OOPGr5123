package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>  {
    private List<Student> group;
    private Integer idGroup;
    /** Поле размер группы */
    private Integer size;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * 
     * @param group            - группа
     * @param idGroup          - id-группы
     * @param size     - размер группы
     * @see StudentGroup#StudentGroup()
     */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        this.size = group.size();
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }


    @Override
    public String toString() {
        return "StudentGroup. " + "Группа № " + idGroup + ", количество студентов - " + group.size() + ": " + group;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //    return new Iterator<Student>() {

    //     private int counter;

    //     @Override
    //     public boolean hasNext() {

    //         if(counter<group.size())
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;
    //         }
    //     }

    //     @Override
    //     public Student next() {
    //         return group.get(counter++);
    //     }

    //    };

    // }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);

    }

    /** Добавил интерфейс */
    @Override
    public int compareTo(StudentGroup o) {
        
        if (size == o.size)
            return 0;
        else if (size > o.size)
            return 1;
        else
            return -1;
    }

    
    
}
