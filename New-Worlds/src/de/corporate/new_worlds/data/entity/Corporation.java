package de.corporate.new_worlds.data.entity;

import java.util.ArrayList;

public class Corporation {
	
	//unique identifier
	private long id;
	
	//name of the corporation
	private String name;
	
	//alias of the owner
	private String owner;
	
	//the amount of liquid money available to the player
	private double balance;
	
	//the loans this company has.
	private ArrayList<Loan> loans;

}
