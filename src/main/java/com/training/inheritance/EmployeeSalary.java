package com.training.inheritance;

public class EmployeeSalary {

	private int emplId;
	private String empName;
	private double basicSal;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSal;
	private double grossSal;

	public EmployeeSalary() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeSalary(int emplId, String empName, double basicSal, double medical) {
		super();
		this.emplId = emplId;
		this.empName = empName;
		this.basicSal = basicSal;
		this.hra = this.basicSal * 50 / 100;
		this.medical = medical;
		this.pf = this.basicSal * 12 / 100;
		this.pt = 200;

	}

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

	public double calculateGrossSal() {
		grossSal = this.basicSal + this.hra + this.medical;
		return grossSal;

	}

	public double calculateNetSal() {

		netSal = grossSal - (pt + pf);
		return netSal;
	}

	public String showDetials() {
		String details = "EmployeeSalary [emplId=" + emplId + ", empName=" + empName + ", basicSal=" + basicSal
				+ ", netSal=" + netSal + ", grossSal=" + grossSal + "]";
		return details;
	}

}
