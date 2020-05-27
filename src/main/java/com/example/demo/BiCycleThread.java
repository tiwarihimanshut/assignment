package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BiCycleThread implements Runnable
{
	static double totalCost;
	static double costAmounttotal;
	static String answer;
	static int quantity;
	
	@Override
	public void run()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the quanity of cycle  : ");
			 quantity = Integer.parseInt(br.readLine());
			
			
			System.out.print("If you want to configure your all Cycle press Y else N  : ");
			 answer = br.readLine();
			if(answer.equalsIgnoreCase("Y")) {
				
				for (int i = 0; i < quantity; i++) {
					// Frame k lie
					System.out.print("Enter the name of type of Frame : ");
					String frame_type = br.readLine();

					System.out.print("Enter the Amount for " + frame_type + " type : ");
					double framecost = Double.parseDouble(br.readLine());

					BiCycle bicycle = BiCycleFactory.buildComponent(Components.FRAME);
					totalCost = totalCost + bicycle.returnAmount(framecost);
					System.out.println("total cost FRAME : " + totalCost);

					// Handle k lie
					System.out.print("Enter the Amount for handle bar : ");
					double handleBarCost = Double.parseDouble(br.readLine());
					System.out.print("Enter the Amount for break : ");
					double breakCost = Double.parseDouble(br.readLine());

					BiCycle handle_bar = BiCycleFactory.buildComponent(Components.HANDLE_BAR);
					totalCost = totalCost + handle_bar.returnAmount(handleBarCost + breakCost);
					System.out.println("total cost HANDLE_BAR : " + totalCost);

					// seat k lie
					System.out.print("Enter the Amount for Seat : ");
					double seatCost = Double.parseDouble(br.readLine());

					BiCycle seating = BiCycleFactory.buildComponent(Components.SEATING);
					totalCost = totalCost + seating.returnAmount(seatCost);
					System.out.println("total cost SEATING : " + totalCost);
					// chain k lie
					System.out.print("Enter the Amount for Chain Assembly : ");
					double chainCost = Double.parseDouble(br.readLine());

					BiCycle chain_assembly = BiCycleFactory.buildComponent(Components.CHAIN_ASSEMBLY);
					totalCost = totalCost + chain_assembly.returnAmount(chainCost);

					System.out.println("total cost CHAIN_ASSEMBLY : " + totalCost);

					// wheels k lie
					// spokes, rim, tube, tyre.
					System.out.print("Enter the Amount for Wheels spokes : ");
					double spokesCost = Double.parseDouble(br.readLine());

					System.out.print("Enter the Amount for Wheels Rim : ");
					double rimCost = Double.parseDouble(br.readLine());

					System.out.print("Enter the Amount for Wheels tube : ");
					double tubeCost = Double.parseDouble(br.readLine());

					System.out.print("Enter the Amount for Wheels tyre : ");
					double tyreCost = Double.parseDouble(br.readLine());

					BiCycle wheels = BiCycleFactory.buildComponent(Components.WHEELS);
					totalCost = totalCost + wheels.returnAmount(spokesCost + rimCost + tubeCost + tyreCost);

					System.out.println("total cost of 1 BiCycle : " + totalCost);
					costAmounttotal = costAmounttotal +totalCost;
				}
				System.out.println("total cost of "+quantity+" BiCycle is : " + costAmounttotal);
			}else {
				System.out.print("Enter the name of type of Frame : ");
				String frame_type = br.readLine();

				System.out.print("Enter the Amount for " + frame_type + " type : ");
				double framecost = Double.parseDouble(br.readLine());

				BiCycle bicycle = BiCycleFactory.buildComponent(Components.FRAME);
				totalCost = totalCost + bicycle.returnAmount(framecost);
				System.out.println("total cost FRAME : " + totalCost);

				// Handle k lie
				System.out.print("Enter the Amount for handle bar : ");
				double handleBarCost = Double.parseDouble(br.readLine());
				System.out.print("Enter the Amount for break : ");
				double breakCost = Double.parseDouble(br.readLine());

				BiCycle handle_bar = BiCycleFactory.buildComponent(Components.HANDLE_BAR);
				totalCost = totalCost + handle_bar.returnAmount(handleBarCost + breakCost);
				System.out.println("total cost HANDLE_BAR : " + totalCost);

				// seat k lie
				System.out.print("Enter the Amount for Seat : ");
				double seatCost = Double.parseDouble(br.readLine());

				BiCycle seating = BiCycleFactory.buildComponent(Components.SEATING);
				totalCost = totalCost + seating.returnAmount(seatCost);
				System.out.println("total cost SEATING : " + totalCost);
				// chain k lie
				System.out.print("Enter the Amount for Chain Assembly : ");
				double chainCost = Double.parseDouble(br.readLine());

				BiCycle chain_assembly = BiCycleFactory.buildComponent(Components.CHAIN_ASSEMBLY);
				totalCost = totalCost + chain_assembly.returnAmount(chainCost);

				System.out.println("total cost CHAIN_ASSEMBLY : " + totalCost);

				// wheels k lie
				// spokes, rim, tube, tyre.
				System.out.print("Enter the Amount for Wheels spokes : ");
				double spokesCost = Double.parseDouble(br.readLine());

				System.out.print("Enter the Amount for Wheels Rim : ");
				double rimCost = Double.parseDouble(br.readLine());

				System.out.print("Enter the Amount for Wheels tube : ");
				double tubeCost = Double.parseDouble(br.readLine());

				System.out.print("Enter the Amount for Wheels tyre : ");
				double tyreCost = Double.parseDouble(br.readLine());

				BiCycle wheels = BiCycleFactory.buildComponent(Components.WHEELS);
				totalCost = totalCost + wheels.returnAmount(spokesCost + rimCost + tubeCost + tyreCost);

				System.out.println("total cost of 1 BiCycle : " + totalCost);
				
				costAmounttotal = quantity*totalCost;
				System.out.println("total cost of "+quantity+" BiCycle is : " + quantity*totalCost);
				
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
