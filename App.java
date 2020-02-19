package com.homeTask.Task_2;
import java.util.*;
/**
 * Hello world!
 *
 */
class InterestCalculator
{
	public double calculateSI(double principal,double rate , int time)
	{
		return (principal*rate*time)/100;
	}
	public double calculateCI(double principal,double rate , int time)
	{
		double amount = principal * Math.pow(1+rate/100, time);
		return amount - principal;
	}
}
class HouseCostCalculator
{
	public double calculateCost(int materialStandard,double areaOfHouse,boolean fullyAutomated)
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
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal");
        double principal = sc.nextDouble();
        System.out.println("Enter rate");
        double rate = sc.nextDouble();
        System.out.println("Enter time");
        int time = sc.nextInt();
        
        InterestCalculator interestCalculator = new InterestCalculator();
        double CI = interestCalculator.calculateCI(principal, rate, time);
        double SI = interestCalculator.calculateSI(principal, rate, time);
        
        System.out.println("Compound Interest : " + CI);
        System.out.println("Simple Interest : " + SI);
        
        System.out.println("House Construction Cost Estimation : ");
        System.out.println("Choose House Material : ");
        System.out.println("0 - Standard Material");
        System.out.println("1 - Above Standard Material");
        System.out.println("2 - High Standard Material");
        int materialStandard = sc.nextInt();
        System.out.println("Enter House area");
        double areaOfHouse = sc.nextDouble();
        boolean fullyAutomated = false;
        if(materialStandard == 2)
        {
        	System.out.println("Do you want home fully automated : Y for Yes or N for No");
             fullyAutomated = (sc.next().equalsIgnoreCase("Y"));
        }
        
        
        HouseCostCalculator houseCostCalculater = new HouseCostCalculator();
        double cost = houseCostCalculater.calculateCost(materialStandard, areaOfHouse, fullyAutomated);
        System.out.print("Estimated Construction Cost of House : " + cost);
        sc.close();
    }
}
