package de.corporate.new_worlds.data.entity;

public class Loan {
	
	//unique identifier
	private long id;
	
	//interest to pay
	private double interest;
	
	//the amount of money
	private double amount;
	
	//the time in turns until a new interest rate is set
	private int time;
	
	//the time between each interest calculation
	private int interval;

}
