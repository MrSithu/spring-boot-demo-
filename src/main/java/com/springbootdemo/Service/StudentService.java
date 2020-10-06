package com.springbootdemo.Service;

import com.springbootdemo.Dao.StudentDao;
import com.springbootdemo.Entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAlStudents() {
        return studentDao.getAlStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateSudent(Student student) {
        this.studentDao.updateSudent(student);
    }

    public void insertSudent(Student student) {
        this.studentDao.insertSudentToDb(student);
    }

}
