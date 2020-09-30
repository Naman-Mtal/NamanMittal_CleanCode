package com.homeTask.Task_2;
import java.util.*;

class InterestCalculator
{
	public static double calculateSI(double principal, double rate, int time)
	{
		return (principal*rate*time)/100;
	}
	public static double calculateCI(double principal, double rate, int time)
	{
		double amount = principal * Math.pow(1+rate/100, time);
		return amount - principal;
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
        
        double CI = InterestCalculator.calculateCI(principal, rate, time);
        double SI = InterestCalculator.calculateSI(principal, rate, time);
        
        System.out.println("Compound Interest : " + CI);
        System.out.println("Simple Interest : " + SI);
        
        
        sc.close();
    }
}
