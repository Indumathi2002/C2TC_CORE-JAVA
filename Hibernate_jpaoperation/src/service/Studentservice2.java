package service;
import com.cg.jpacrud.dao.StudentDao;
import com.cg.jpacrud.entities.Student;

import dao.StudentDaoImpl;
public abstract class Studentservice2 implements Studentservice1 {
private StudentDao dao;
public Studentservice2()
 {
dao = new Student();
}
}
@Override
public void addStudent(Student student) {
dao.beginTransaction();
dao.addStudent(student);
dao.commitTransaction();
}
@Override
public void updateStudent(Student student) {
dao.beginTransaction();
dao.updateStudent(student);
dao.commitTransaction();
}
@Override
public void removeStudent(Student student) {
dao.beginTransaction();
dao.removeStudent(student);
dao.commitTransaction();
}
@Override
public Student findStudentById(int id) {
//no need of transaction, as it's an read operation
Student student = dao.getStudentById(id);
return student;
}
}