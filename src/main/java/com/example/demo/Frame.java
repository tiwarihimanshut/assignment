package com.example.demo;

public class Frame extends BiCycle
{

	Frame ()
	{
		super(Components.FRAME);
		construct();
	}

	@Override
	protected void construct()
	{
		System.out.println("BiCycle FRAME is calculating");
		// add accessories
	}

	@Override
	synchronized public double returnAmount(double amount)
	{
		System.out.println("Amount for Frame is  : "+amount);
		return this.totalAmount = this.totalAmount + amount;
	}
}
