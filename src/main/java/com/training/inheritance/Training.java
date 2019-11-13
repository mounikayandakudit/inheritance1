package com.training.inheritance;

public abstract class Training {
	
	 static int id;
	 String subject;
	 double fees;
	 
	 //Default constructor
	 public Training() {
		 Training.id = id++;
	}
   
	 //Paramterised constructor
	public Training(String subjects, double fees) {
		super();
		this.subject = subjects;
		this.fees = fees;
	}
 
	//method  for calculating order
	public abstract double getOrderValue();
		// TODO Auto-generated method stub
	




}
