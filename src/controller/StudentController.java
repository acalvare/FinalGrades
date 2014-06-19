package controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import service.StudentService;
import domain.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/")
	public String viewStudents(Model model){
		model.addAttribute("student", new Student());
		return "StudentView";
	}
	
	@RequestMapping(value="/addStudent")
	public String addStudents(@ModelAttribute Student student, Model model){
		System.out.println(student);
		student.sortGrades();
		student.calculatePercent();
		student.calculateGrade();
		studentService.save(student);
		studentService.sortStudents();
		model.addAttribute("students", studentService.getAllStudents());
		return "StudentList";
	}

}
