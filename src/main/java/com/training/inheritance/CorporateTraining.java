package com.training.inheritance;

public class CorporateTraining extends Training {

	int days;

	// default constructor
	public CorporateTraining() {
		// TODO Auto-generated constructor stub
	}

	public CorporateTraining(String subject, double fees, int days) {
		super(subject, fees);
		this.days = days;
	}

	// Method to calculate cost
	public double getOrderValue() {

		double cost = fees * days;
		return cost;

	}

}
