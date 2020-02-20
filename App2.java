package com.homeTask.Task_2;

import java.util.*;

class HouseCostCalculator
{
	public static double calculateCost(int materialStandard,double areaOfHouse,boolean fullyAutomated)
	{
		double cost;
		if(materialStandard==0)
			cost = 1200 * areaOfHouse;
		else if(materialStandard==1)
			cost = 1500 * areaOfHouse;
		else
		{
			if(fullyAutomated)
				cost = 2500 * areaOfHouse;
			else
				cost = 1800 * areaOfHouse;
		}
		return cost;
	}
	
}
public class App2 {

	 public static void main( String[] args )
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("House Construction Cost Estimation : ");
	        System.out.println("Choose House Material : \n 0 - Standard Material \n 1 - Above Standard Material \n 2 - High Standard Material");
	        int materialStandard = sc.nextInt();
	        System.out.println("Enter House area");
	        double areaOfHouse = sc.nextDouble();
	        boolean fullyAutomated = false;
	        if(materialStandard == 2)
	        {
	        	System.out.println("Do you want home fully automated : Enter Y for Yes or N for No");
	             fullyAutomated = (sc.next().equalsIgnoreCase("Y"));
	        }
	        double cost = HouseCostCalculator.calculateCost(materialStandard, areaOfHouse, fullyAutomated);
	        
	        System.out.print("Estimated Construction Cost of House : " + cost);
	        
	        sc.close();
	    }
}
