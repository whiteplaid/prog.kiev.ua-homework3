package com.homework.groupofstudents;

public class Student extends Human {
	private String name;
	private String surename;
	public Student(boolean sex, String eyesColor, String hairColor, String name, String surename) {
		super(sex, eyesColor, hairColor);
		this.name = name;
		this.surename = surename;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(boolean sex, String eyesColor, String hairColor) {
		super(sex, eyesColor, hairColor);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurename() {
		return surename;
	}
	public void setSurename(String surename) {
		this.surename = surename;
	}
	@Override
	public boolean isSex() {
		// TODO Auto-generated method stub
		return super.isSex();
	}
	@Override
	public void setSex(boolean sex) {
		// TODO Auto-generated method stub
		super.setSex(sex);
	}
	@Override
	public String getEyesColor() {
		// TODO Auto-generated method stub
		return super.getEyesColor();
	}
	@Override
	public void setEyesColor(String eyesColor) {
		// TODO Auto-generated method stub
		super.setEyesColor(eyesColor);
	}
	@Override
	public String getHairColor() {
		// TODO Auto-generated method stub
		return super.getHairColor();
	}
	@Override
	public void setHairColor(String hairColor) {
		// TODO Auto-generated method stub
		super.setHairColor(hairColor);
	}



	

	
}
