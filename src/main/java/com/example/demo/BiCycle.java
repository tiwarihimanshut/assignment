package com.example.demo;

public abstract class BiCycle
{
	private Components components = null;

	volatile double totalAmount;

	public abstract double returnAmount(double amount);

	// Do subclass level processing in this method
	protected abstract void construct();

	public BiCycle(Components component)
	{
		this.components = component;
		arrangeParts();
	}

	private void arrangeParts()
	{
		// Do one time processing here
	}

	public Components getComponent()
	{
		return components;
	}

	public void setModel(Components component)
	{
		this.components = component;
	}
}