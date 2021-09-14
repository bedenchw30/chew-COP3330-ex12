
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
import java.util.Scanner;
public class exerciseTwelve {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rateOfInterest = input.nextDouble();

        System.out.print("Enter the number of years: ");
        double numOfYears = input.nextDouble();

        double investmentTotal = (principal*(1+rateOfInterest*.01*numOfYears));
        System.out.println("After " +numOfYears+ " years at " + rateOfInterest +"%, the investment will be worth $"+Math.round(investmentTotal*100)/100.0 +".");
    }
}
