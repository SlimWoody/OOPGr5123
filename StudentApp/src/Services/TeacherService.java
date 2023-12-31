package Services;
import java.util.ArrayList;
import java.util.List;

import Domen.PersonComporator;
import Domen.Teacher;
/**
 * Создал класс TeacherService и реализовал аналогично проделанному на семинаре.
 */
public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService(){
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "acadDegree");
        count++;
        teachers.add(teach);
    }

    /**
     * Добавил метод вывода списка учителей отсортированного
     * обобщенным классом PersonComparator
     */
    public void SortByFIO()
    {
        PersonComporator<Teacher> teachComp = new PersonComporator<Teacher>();
        teachers.sort(teachComp);
    }
    
}
