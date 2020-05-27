package com.example.demo;
public class HandleBar extends BiCycle
{
	 

	HandleBar ()
	{
		super(Components.HANDLE_BAR);
		construct();
	}

	@Override
	protected void construct()
	{
		System.out.println("BiCycle HANDLE_BAR is calculating");
		// add accessories
	}
	
	@Override
	synchronized public double returnAmount(double amount)
	{
		System.out.println("Amount for HandleBar is  : "+amount);
		return this.totalAmount = this.totalAmount + amount;
	}
}