package com.campusdual.classroom;

public class Doctor extends Person {

	private String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void getDetails(){
		System.out.println("Name: " + this.name + ", Surname: " + this.surname + ", Specialization: " + this.specialization);
	}
}
