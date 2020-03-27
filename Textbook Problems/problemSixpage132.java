/*
 * Author: Hailyn Valle Luque
 * Date: September 17th, 2017
 * Purpose: The purpose of this program is to convert a four digit binary number to decimal form.
 * Algorithm:
 * 	1. Declare Variables
 * 		bitNum: String
 * 		firstNumber: int
		firstNumberMult: int
		secondNumber: int
		secondNumberMult: int
		thirdNumber: int
		thirdNumberMult: int
		fourthNumber: int
		fourthNumberMult: int
		decimalNumber: int
 * 	2. Prompt the user for a 4-digit binary number.
 * 	3. Take the user input assign it to the String bitNum.
 * 	4. Separate the string bitNum by index using the .charAt method 
 * 	   and specifying what index we'd like to use, in this case 0-3.
 *  5. Subtract 48 from every value in the index.
 *  6. Multiply the result by the weight of the index in index 0-3.
 *  7. Add the products together and assign that value to the integer decimalNumber.
 *  8. Display decimalNumber.
 * 
 */

import java.util.Scanner;
public class problemSixpage132 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//USER INPUT
		System.out.println("Please enter a 4-digit binary number");
		String bitNum = keyboard.next();
		
		/*
		 * 
		 * FOR MY REFERENCE 
		 * bitNum.charAt(0); - FOURTH NUMBER - WIEGHT 2^3 = 8
		 * bitNum.charAt(1); - THIRD NUMBER2 - WIEGHT 2^2 = 4
		 * bitNum.charAt(2); - SECOND NUMBER - WIEGHT 2^1 = 2
		 * bitNum.charAt(3); - FIRST NUMBER  - WIEGHT 2^0 = 1
		 * 
		 * 
		 */
		
		//CALCULATIONS
		bitNum.charAt(0);
		bitNum.charAt(1);
		bitNum.charAt(2);
		bitNum.charAt(3);
		
		int firstNumber = bitNum.charAt(0) - 48;
		int firstNumberMult = firstNumber * 8;
		int secondNumber = bitNum.charAt(1) - 48;
		int secondNumberMult = secondNumber * 4;
		int thirdNumber = bitNum.charAt(2) - 48 ;
		int thirdNumberMult = thirdNumber * 2;
		int fourthNumber = bitNum.charAt(3) -48 ;
		int fourthNumberMult = fourthNumber * 1;
		int decimalNumber = firstNumberMult + secondNumberMult + thirdNumberMult + fourthNumberMult;
		
		//OUTPUT
		System.out.println(bitNum + " in decimal form is " + decimalNumber);
	

		
		
		/*
		 
		  CHEATER WAY 
		 		int resultOne = Integer.parseInt(bitNum.substring(0,1));
		 		int fourthNumber = resultOne * 8;
		 		int resultTwo = Integer.parseInt(bitNum.substring(1,2));
		 		int thirdNumber = resultTwo * 4;
		 		int resultThree = Integer.parseInt(bitNum.substring(2,3));
		 		int secondNumber = resultThree * 2;
		 		int resultFour = Integer.parseInt(bitNum.substring(3,4));
		 		int firstNumber = resultFour * 1;
		 		int decimalNumber = fourthNumber + thirdNumber + secondNumber + firstNumber;
		
				//OUTPUT
		 		System.out.println(bitNum + " in decimal form is:");
				System.out.println(decimalNumber);

		 */

		

	}

}
