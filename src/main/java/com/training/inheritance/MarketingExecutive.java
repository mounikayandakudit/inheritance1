package com.training.inheritance;

public class MarketingExecutive extends Employee {
	int kms;
	double tourAllowance;
	double telephoneAllowance;

	// Default constructor
	public MarketingExecutive() {
		// TODO Auto-generated constructor stub
	}

	// Parameterised constructor
	public MarketingExecutive(int emplId, String empName, double basicSal, double medical, int kms) {
		super(emplId, empName, basicSal, medical);
		this.kms = kms;
		this.tourAllowance = 5 * kms;
		this.telephoneAllowance = 1500;
	}

	// getters and setters
	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public double getTourAllowance() {
		return tourAllowance;
	}

	public void setTourAllowance(double tourAllowance) {
		this.tourAllowance = tourAllowance;
	}

	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}

	public void setTelephoneAllowance(double telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}

	// To string method to print
	@Override
	public String toString() {
		return "MarketingExecutive [kms=" + kms + ", tourAllowance=" + tourAllowance + ", telephoneAllowance="
				+ telephoneAllowance + "]";
	}

	// method to calculate grossSalary
	@Override
	public double calculateGrossSal() {
		double grossSal = basicSal + hra + medical + tourAllowance + telephoneAllowance;
		setGrossSal(grossSal);
		return grossSal;
	}

	// method to calculate netsalary
	@Override
	public double calculateNetSal() {
		// TODO Auto-generated method stub
		double netSal = (this.calculateGrossSal() - (pt + pf)) - (tourAllowance + telephoneAllowance);
		setNetSal(netSal);
		return netSal;
	}

}
