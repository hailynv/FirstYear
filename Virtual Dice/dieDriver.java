public class dieDriver 
{
	public static void main(String[] args) 
	{
		//first test case - setting the number of faces on the dice
		System.out.println("First test case");
		Die firstDice = new Die();
		firstDice.print();
		Die secondDice = new Die(4);
		secondDice.print();
		Die thirdDice = new Die (10);
		thirdDice.print();
		
		//second test case - setting the value of the dice
		System.out.println("");
		System.out.println("Second test case");
		firstDice.setValue(3);
		firstDice.print();
		secondDice.setValue(5);
		secondDice.print();
		thirdDice.setValue(0);
		thirdDice.print();
		
		//third test case - freezing the dice
		System.out.println("");
		System.out.println("Third test case");
		firstDice.freeze(5);
		firstDice.print();
		firstDice.unfreeze(false, 5);
		firstDice.print();
		
		//fourth test case - drawing the dice
		System.out.println("");
		System.out.println("Fourth test case");
		firstDice.draw();
		secondDice.draw();
		thirdDice.draw();
		
		//fifth test case - rolling the dice + drawing the dice
		System.out.println("");
		System.out.println("Fifth test case");
		System.out.println("Dice 1 test");
		for (int dice1 = 0; dice1 < 10; dice1++)
		{
			firstDice.roll();
		}
		
		System.out.println("Dice 2 test");
		for (int dice2 = 0; dice2 < 3; dice2++)
		{
			secondDice.roll();
			secondDice.draw();
		}
		
		System.out.println("Dice 3 test");
		for (int dice3 = 0; dice3 < 10; dice3++)
		{
			thirdDice.roll();
		}
	}
}