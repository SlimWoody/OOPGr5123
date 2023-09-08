/**
 * @autor Лузин Павел
 * Создал новый класс StudentStream
 */



package Domen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> stream;
    private Integer idStream;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * 
     * @param stream            - поток
     * @param idStream         - id-потока
     * @see StudentStream#StudentStream()
     */
    public StudentStream(List<StudentGroup> stream, Integer idStream) {
        this.stream = stream;
        this.idStream = idStream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getIdStream() {
        return idStream;
    }

    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    @Override
    public String toString() {
        return "StudentStream. " + "Поток № " + idStream + ": " + stream;
    }

    /**
     * Переопределил метод toString.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return stream.iterator();
    }

}
