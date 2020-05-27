package com.example.demo;
public abstract class BiCycleFactory
{

	public static BiCycle buildComponent(Components component)
	{
		BiCycle bicycle = null;
		switch (component)
		{
		case FRAME:

			return new Frame();
		case HANDLE_BAR:

			return new HandleBar();
		case SEATING:

			return new Seating();
		case WHEELS:

			return new Wheels();
		case CHAIN_ASSEMBLY:

			return new ChainAssembly();
		}
		return bicycle;
	}

}
