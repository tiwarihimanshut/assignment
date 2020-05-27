package com.example.demo;

public class ChainAssembly extends BiCycle
{

	ChainAssembly()
	{
		super(Components.CHAIN_ASSEMBLY);
		construct();
	}

	@Override
	protected void construct()
	{
		System.out.println("BiCycle CHAIN_ASSEMBLY is calculating");
		// add accessories
	}

	@Override
	synchronized public double returnAmount(double amount)
	{
		System.out.println("Amount for ChainAssembly is  : " + amount);
		return this.totalAmount = this.totalAmount + amount;
	}
}