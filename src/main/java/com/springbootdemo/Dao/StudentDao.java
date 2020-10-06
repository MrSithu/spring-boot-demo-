package com.springbootdemo.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.springbootdemo.Entity.Student;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            {
                put(1, new Student(1, "Sithu", "IS"));
                put(2, new Student(2, "PyaePyae", "CE"));
                put(3, new Student(3, "AungAung", "EC"));
            }
        };
    }

    public Collection<Student> getAlStudents() {
        return StudentDao.students.values();
    }

    public Student getStudentById(int id) {
        return StudentDao.students.get(id);
    }

    public void removeStudentById(int id) {
        StudentDao.students.remove(id);
    }

    public void updateSudent(Student student) {
        Student s = students.get(student.getId());
        s.setName(student.getName());
        s.setCourse(student.getCourse());
        students.put(student.getId(), student);
    }

    public void insertSudentToDb(Student student) {
        StudentDao.students.put(student.getId(), student);
    }
}
