package com.example.demo;
public class Wheels extends BiCycle
{

	Wheels ()
	{
		super(Components.WHEELS);
		construct();
	}

	@Override
	protected void construct()
	{
		System.out.println("BiCycle WHEELS is calculating");
		// add accessories
	}

	@Override
	synchronized public double returnAmount(double amount)
	{
		System.out.println("Amount for Wheels is  : "+amount);
		return this.totalAmount = this.totalAmount + amount;
	}
}