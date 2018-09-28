package com.homework.groupofstudents;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;

public class Group {
	private Student[] group = new Student[10];
	private int groupCount = 0; 

	public Group(Student[] group) {
		super();
		this.group = group;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	} 
	
	
	

	public void addStudent (Student one) throws MyArrayIndexOutOfBoundsException{
		for (int i = 0; i < group.length; i++) {
			if(group[i] == null) {
				group[i] = one;
				groupCount++;
				return;
			}
		} throw new MyArrayIndexOutOfBoundsException("The group can`t be more than 10 students");
	}
	public void deleteStudent (Student one) {
		for (int i = 0; i < group.length;i++) {
			if (group[i] != null) {
				if (group[i].equals(one)) {
					group[i] = null;
					groupCount--;
				}
			}
		}
	}
	public int findStudent (String sureName) {
		int result = 11;
		try {
			sort();
		for(int i = 0; i < group.length;i++) {
			
				if (group[i].getSurename().equals(sureName)) {
					result = i;
					System.out.println(group[result].getSurename() +" has been found in the group by number " + (result + 1));
				}
		}
		group[result].getSurename();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("There is no student with this surename " + sureName + " in this group");
			}
		
		return result;
	}
	
	private boolean compare(String one, String two) {
		int check = 0;

        try {
            check = one.compareTo(two);

        } catch (NullPointerException e) {

            check = 0;

        }

        return (check > 0) ? false : true;
		
	}



	public void sort () {
		Student tempStr;
			
		for (int t = 0; t < groupCount - 1; t++) {
		    for (int i= 0; i < groupCount - t -1; i++) {
		        if(compare(group[i+1].getSurename(), group[i].getSurename())) {
		        		tempStr = group[i];
			            group[i]=group[i+1];
			            group[i+1]=tempStr; 	
		         } 
		     }
		}	
	}
	@Override
	public String toString() {
		String[] students = new String[groupCount];
		sort();
		for (int i = 0; i < groupCount;i++) {
			students[i] = group[i].getName() + " " + group[i].getSurename();
		}
		return "Total students " + groupCount + " " + Arrays.toString(students) + "";
	}
	
}
