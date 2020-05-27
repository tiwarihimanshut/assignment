package com.example.demo;
public class Seating extends BiCycle
{

	Seating ()
	{
		super(Components.SEATING);
		construct();
	}

	@Override
	protected void construct()
	{
		System.out.println("BiCycle SEATING is calculating");
		// add accessories
	}
	
	@Override
	synchronized public double returnAmount(double amount)
	{
		System.out.println("Amount for Seating is  : "+amount);
		return this.totalAmount = this.totalAmount + amount;
	}
}