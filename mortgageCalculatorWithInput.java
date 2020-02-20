/*
 * Author: Hailyn Valle Luque
 * Date: September 22nd, 2017
 * Purpose: The purpose of this program is to calculate a person's monthly payment on their mortgage by
 * 			using the present value of their home, interest rate, and term of their mortgage.
 * Algorithm:
 * 	1. Declare Variables
 * 		monthlyPaymentNumerator: double
 *		monthlyPaymentDenominator: double
 *		monthlyPaymentFinal: double
 *		interest: double
 *		interestInput: double
 *		interestMonthly: double
 *		numOfMonths: int
 *		presentValue: int
 *		Years: int
 *	2. Prompt the user to enter the present value of their house, the term of their mortgage in years,
 *	   and their interest rate.
 *	3. Take the user's interest and divide it by 100 and assign the result to interestInput.
 *	4. Take interestInput and divide it by 12 and assign the result to interestMonthly.
 *	5. Calculate the number of months by multiplying Years by 12 and assigning the product to numOfMonths.
 *	6. Multiply interestMonthly and presentValue and assign the product to monthlyPaymentNumerator.
 *	7. Add 1 and interestMonthly, and raise the sum to the power of -numOfMonths.
 *	8. Subtract the result from step #7 from 1.
 *	9. Assign the result from steps #7 and #8 to monthlyPaymentDenominator.
 *	10. Divide monthlyPaymentNumerator and monthlyPaymentDenominator and assign the quotient to monthlyPaymentFinal.
 *	11. Display presentValue, Years, numOfMonths, interest, and monthlyPaymentFinal.
 */
import java.util.Scanner;
public class mortgageCalculatorWithInput {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//VARIABLES
		double monthlyPaymentNumerator;
		double monthlyPaymentDenominator;
		double monthlyPaymentFinal;
		double interest;
		double interestInput;
		double interestMonthly;
		int numOfMonths;
		int presentValue;
		int Years;
		
		//USER INPUT
		System.out.println("Please enter the present value of your house.");
		presentValue = keyboard.nextInt();
		System.out.println("Please enter the term of your loan in years.");
		Years = keyboard.nextInt();
		System.out.println("Please enter your interest rate.");
		interest = keyboard.nextDouble();
		
		//CALCULATIONS
		interestInput = interest / 100;
		interestMonthly = interestInput / 12;
		numOfMonths = 12 * Years;
		monthlyPaymentNumerator = interestMonthly * presentValue;
		monthlyPaymentDenominator = ((double) (1 -  Math.pow( 1 + interestMonthly, -numOfMonths)) );
		monthlyPaymentFinal = monthlyPaymentNumerator / monthlyPaymentDenominator;
		
		
		
		//OUTPUT
		System.out.println("Mortgage Calculator - H. Valle Luque");
		System.out.println(" ");
		System.out.println("Present value: " + presentValue);
		System.out.println("Term (years): " + Years);
		System.out.println("Term (months): " + numOfMonths);
		System.out.println("Rate: " + interest);
		System.out.printf("Monthly payment: $%,.2f" , monthlyPaymentFinal);
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		

	}

}

