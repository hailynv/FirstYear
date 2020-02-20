/*
 * Author: Hailyn Valle Luque
 * Date: September 18th, 2017
 * Purpose: The purpose of this program is to utilize the user's age in years, weight in pounds, and height in inches
 * 			to determine how many chocolate bars they need to consume a day in order to maintain their weight.
 * Algorithm:
 * 	1. Declare Variables:
 * 		AgeYears: int
 * 		WeightLbs: int
 * 		HeightInches: int
 * 		BMRman: int
 * 		BMRwoman: int
 * 2.Prompt the user for their age, weight, and height.
 * 3. Calculate a man's basal metabolic rate by using the equation provided and the user's input.
 * 4. Calcute a woman's basal metabolic rate by using the equation provided and the user's input.
 * 5. Display how many chocolate bars a man and a woman need to consume in order to meet their daily caloric needs.
 */

import java.util.Scanner;

public class problemEight_PageOneThirtyThree {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//VARIABLES
		int AgeYears;
		int WeightLbs;
		int HeightInches;
		int BMRman;
		int BMRwoman;
		
		
		//USER INSTRUCTION + INPUT
		System.out.println("Please enter your age in years.");
		AgeYears = keyboard.nextInt();
		System.out.println("Please enter your weight in pounds");
		WeightLbs = keyboard.nextInt();
		System.out.println("Please enter your height in inches.");
		HeightInches = keyboard.nextInt();
				
		//CALCULATIONS
		BMRman = (int) ((655 +  4.3 * WeightLbs  +  4.7 * HeightInches  - 4.7 * AgeYears) / 230);
		BMRwoman = (int) ((66 + 6.3 * WeightLbs + 12.9 * HeightInches - 6.8 * AgeYears) / 230);
		
		//OUTPUT
		System.out.println("If you are a man, you need to eat " + BMRman + " chocolate bars a day to meet your daily caloric needs.");
		System.out.println("If you are a woman, you need to eat " + BMRwoman + " chocolate bars a day to meet your daily caloric needs.");

	}

}
