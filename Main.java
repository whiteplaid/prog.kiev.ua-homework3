package com.homework.groupofstudents;

public class Main {

	public static void main(String[] args) {
		Group students = new Group();
		Student one = new Student(true, "Green", "Black", "Petya", "Vasechkin");
		Student two = new Student(true, "Green", "Black", "Vasya", "Vasechkin");
		Student three = new Student(false, "Blue","Brown", "Anna", "Aloe");
		Student four = new Student(true, "Blue","Brown", "Andrey", "Bilboe");
		Student five = new Student(false, "Blue","Brown", "Nastya", "Vishnya");
		Student six = new Student(false, "Blue","Brown", "Anna", "Bilboe");
		Student seven = new Student(false, "Blue","Brown", "Alena", "Petrick");
		Student eight = new Student(false, "Blue","Brown", "Anna", "Smorodina");
		Student nine = new Student(true, "Blue","Brown", "Petya", "Vzhik");
		Student ten = new Student(true, "Green","Brown", "Volodya", "Zhmil");
		Student eleven = new Student(false, "Blue","Brown", "Anna", "Semenovich");

		students.addStudent(one);
		students.addStudent(two);
		students.addStudent(three);
		students.addStudent(four);
		students.addStudent(five);
		students.addStudent(six);
		students.addStudent(seven);
		students.addStudent(eight);
		students.addStudent(nine);
		students.addStudent(ten);
		students.findStudent("Vishnya");
		students.findStudent("Zelenaya");
		System.out.println(students);
		students.addStudent(eleven);
	
	}

}
