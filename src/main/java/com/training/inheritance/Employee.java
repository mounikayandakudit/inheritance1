package com.training.inheritance;

public abstract class Employee {

	int emplId;
	String empName;
	double basicSal;
	double hra;
	double medical;
	double pf;
	double pt;
	double netSal;
	double grossSal;

	// Default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// Parameterised constructor
	public Employee(int emplId, String empName, double basicSal, double medical) {
		super();
		this.emplId = emplId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = this.basicSal * 50 / 100;
		this.medical = medical;
		this.pf = this.basicSal * 12 / 100;
		this.pt = 200;
		
	}

	// Setters and getters
	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getPt() {
		return pt;
	}

	public void setPt(double pt) {
		this.pt = pt;
	}

	public double getNetSal() {
		return netSal;
	}

	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}

	public double getGrossSal() {
		return grossSal;
	}

	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}

	// method to calculate gross salary
	public abstract double calculateGrossSal();

	// method to calculate net salary
	public abstract double calculateNetSal();

}
