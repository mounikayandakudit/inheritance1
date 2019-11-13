package com.training.inheritance;

public class PublicTraining extends Training {

	int participants;

	// Default cstructor
	public PublicTraining() {
		// TODO Auto-generated constructor stub

	}

	// Paramterized constructor
	public PublicTraining(String subject, double fees, int participants) {
		super(subject, fees);
		this.participants = participants;
	}

	// Method to calculate cost
	public double getOrderValue() {
		double cost = fees * participants;
		return cost;

	}

}
