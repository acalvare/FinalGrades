package domain;

import java.util.ArrayList;

public class Student {

	private String firstName;

	private String lastName;

	private String finalGrade;

	private int grade1;

	private int grade2;

	private int grade3;

	private int grade4;

	private int grade5;
	
	private int percent;

	private ArrayList<Integer> sortedGrades;

	public Student(){

	}
	public Student(String firstName, String lastName, int grade1, int grade2, int grade3, int grade4, int grade5){
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
		this.grade4 = grade4;
		this.grade5 = grade5;
	}

	public void sortGrades(){
		sortedGrades = new ArrayList<Integer>();
		sortedGrades.add(grade1);
		sortedGrades.add(grade2);
		sortedGrades.add(grade3);
		sortedGrades.add(grade4);
		sortedGrades.add(grade5);

		//using insertion sort since it's only five values
		for(int i = 0 ; i < sortedGrades.size(); i++){
			int min = sortedGrades.get(i);
			int minIndex = i;
			for(int j = i; j< sortedGrades.size(); j++){
				if(sortedGrades.get(j) < min){
					min = sortedGrades.get(j);
					minIndex = j;
				}
			}
			sortedGrades.set(minIndex, sortedGrades.get(i));
			sortedGrades.set(i, min);
		}

	}
	
	public void calculatePercent(){
		final int TOTAL_NUMBER_OF_GRADES = 5;
		int sum = grade1+grade2+grade3+grade4+grade5;
		double average = sum/TOTAL_NUMBER_OF_GRADES;
		percent = (int)Math.round(average);
	}
	
	public void calculateGrade(){
		int tenPointScale = percent / 10;
		double tenPointScaleDouble = (double)(percent / 10.0);
		double difference = tenPointScaleDouble - (double) tenPointScale;

		//Generates the letter portion of the grade
		if(tenPointScale == 10 || tenPointScale == 9)
			finalGrade = "A";
		else if(tenPointScale == 8)
			finalGrade = "B";
		else if(tenPointScale == 7)
			finalGrade = "C";
		else if(tenPointScale == 6)
			finalGrade = "D";
		else
			finalGrade = "F";
		
		//Generates the +/- portion of the grade
		if(!(finalGrade.equals("F")) && !(finalGrade.equals("A")) && (difference <= 0.2))
			finalGrade += "-";
		if(!(finalGrade.equals("F")) && !(finalGrade.equals("A")) && (difference >= 0.8))
			finalGrade += "+";
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(String finalGrade) {
		this.finalGrade = finalGrade;
	}
	public int getGrade1() {
		return grade1;
	}
	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}
	public int getGrade2() {
		return grade2;
	}
	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}
	public int getGrade3() {
		return grade3;
	}
	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}
	public int getGrade4() {
		return grade4;
	}
	public void setGrade4(int grade4) {
		this.grade4 = grade4;
	}
	public int getGrade5() {
		return grade5;
	}
	public void setGrade5(int grade5) {
		this.grade5 = grade5;
	}


	public ArrayList<Integer> getSortedGrades() {
		return sortedGrades;
	}
	public void setSortedGrades(ArrayList<Integer> sortedGrades) {
		this.sortedGrades = sortedGrades;
	}
	
	
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", finalGrade=" + finalGrade + ", grade1=" + grade1
				+ ", grade2=" + grade2 + ", grade3=" + grade3 + ", grade4="
				+ grade4 + ", grade5=" + grade5 + "]";
	}






}
