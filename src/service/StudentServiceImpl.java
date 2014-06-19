package service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import domain.Student;

@Service
public class StudentServiceImpl implements StudentService{

	ArrayList<Student> students = new ArrayList<Student>();

	@Override
	public ArrayList<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student save(Student student) {
		students.add(student);
		return student;
	}

	@Override
	public void sortStudents() {

		//using insertion sort 
		for(int i = 0 ; i < students.size(); i++){
			Student maxStudent = students.get(i);
			int maxIndex = i;
			for(int j = i; j< students.size(); j++){
				if(students.get(j).getPercent() > maxStudent.getPercent()){
					maxStudent = students.get(j);
					maxIndex = j;
				}
			}
			students.set(maxIndex, students.get(i));
			students.set(i, maxStudent);
		}

	}

}
