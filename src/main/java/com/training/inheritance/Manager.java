package com.training.inheritance;

public class Manager extends Employee {

	double petrolAllowance;
	double foodAllowance;
	double otherAllowance;

	// Default constructor
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	// Pramterised constructor
	public Manager(int emplId, String empName, double basicSal, double medical) {
		super(emplId, empName, basicSal, medical);
		this.petrolAllowance = this.basicSal * 8 / 100;
		this.foodAllowance = this.basicSal * 13 / 100;
		this.otherAllowance = this.basicSal * 3 / 100;
	}

	// Setters and getters
	public double getPetrolAllowance() {
		return petrolAllowance;
	}

	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}

	public double getFoodAllowance() {
		return foodAllowance;
	}

	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}

	public double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}

	// To string method to print
	@Override
	public String toString() {
		return "Manager [emplId=" + emplId + ", empName=" + empName + ", basicSal=" + basicSal + ", netSal=" + netSal
				+ ", grossSal=" + grossSal + "]";
	}

	// Method to calculate gross salary
	@Override
	public double calculateGrossSal() {
		// TODO Auto-generated method stub
		grossSal = basicSal + hra + petrolAllowance + foodAllowance + otherAllowance + medical;

		return grossSal;
	}

	// method to calculate net salary
	@Override
	public double calculateNetSal() {

		netSal = (this.calculateGrossSal() - (pt + pf)) - (petrolAllowance + foodAllowance + otherAllowance);
		// TODO Auto-generated method stub
		return netSal;
	}

}
