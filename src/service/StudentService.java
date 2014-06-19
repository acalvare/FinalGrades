package service;

import java.util.ArrayList;

import domain.Student;

public interface StudentService {
	
	ArrayList<Student> getAllStudents();
	Student save(Student student);
	void sortStudents();

}
