/* 
  UML
  Class Name: dieClass
  Instance Variables:
  	- dieValue: int
  	- numSides: int
	- frozen: boolean
  Constructors
  	+ Die()
  	+ Die(int newNumSides)
  Methods:
  	+ roll()
  	+ noPrintRoll()
  	+ print()
  	+ draw()
  	+ freeze(int frozenValue)
  	+ unfreeze(boolean unfreeze, int frozenValue)
 */
import java.util.Random;
public class Die 
{
	//INSTANCE VARIABLES
	private int dieValue; 
	private int numSides;
	private boolean frozen = true;
	
		//CONSTRUCTORS
		//default constructor
		public Die()
		{
			numSides = 6;
			dieValue = 1;
		}
		public Die(int newNumSides)
		{
			if(newNumSides < 1)
			{
				System.out.println("ERROR: Number of sides must be larger than zero. Number of sides has been set to default of 6.");
				numSides = 6;
				dieValue = 1;
			}
			else
			{
				numSides = newNumSides;
				dieValue = 1;
			}
				
		}

			//ACCESSORS AKA GETTERS
			public int getValue()
			{
				return dieValue;
			}

				//MUTATORS AKA SETTERS
				public void setValue(int newValue)
			{
				if (newValue <= 0)
				{
					System.out.println("ERROR: Value must be larger than zero. Value has been set to default of 1.");
					dieValue = 1;
				}
				else
				{
					if (newValue > numSides)
					{
						System.out.println("ERROR: Value must be less or equal to the number of sides. Value has been set to default of 1.");
						dieValue = 1;
					}
					else
						dieValue = newValue;
				}
			}

					//METHODS
					public void roll()
					{
						Random roll = new Random();
						dieValue = roll.nextInt(numSides) + 1;
						System.out.println("[" + dieValue + ":" + numSides + "]");
						//System.out.println("The value of the dice when rolled is " + dieValue);
					}
					public void noPrintRoll()
					{
						Random roll = new Random();
						dieValue = roll.nextInt(numSides) + 1;
					}
					public void print()
					{
						System.out.println("[" + dieValue + ":" + numSides + "]");
					}
					public void draw()
					{
						if(numSides <= 6)
						{
							switch(dieValue)
							{
								case 1:
								{
									System.out.println(". . . . .");
									System.out.println(".       .");
									System.out.println(".   *   .");
									System.out.println(".       .");
									System.out.println(". . . . .");
									break;
									
								}
								case 2:
								{
									System.out.println(". . . . .");
									System.out.println(". *     .");
									System.out.println(".       .");
									System.out.println(".     * .");
									System.out.println(". . . . .");
									 break;
									
								}
								case 3:
								{
									System.out.println(". . . . .");
									System.out.println(". *     .");
									System.out.println(".   *   .");
									System.out.println(".     * .");
									System.out.println(". . . . .");
									break;
								}
								case 4:
								{
									System.out.println(". . . . .");
									System.out.println(". *   * .");
									System.out.println(".       .");
									System.out.println(". *   * .");
									System.out.println(". . . . .");
									break;
									
								}
								case 5:
								{
									System.out.println(". . . . .");
									System.out.println(". *   * .");
									System.out.println(".   *   .");
									System.out.println(". *   * .");
									System.out.println(". . . . .");
									break;
									
								}
								case 6:
								{
									System.out.println(". . . . .");
									System.out.println(". *   * .");
									System.out.println(". *   * .");
									System.out.println(". *   * .");
									System.out.println(". . . . .");
									break;
								}
							}
						}
						else
						{
							System.out.println("[" + dieValue + ":" + numSides + "]");
						}
					}
					public void freeze(int frozenValue)
					{
						if(frozen)
						{
							System.out.println("ERROR: This die is frozen. Value cannot be modified.");
						}
					}
					public void unfreeze(boolean unfreeze, int frozenValue)
					{
						this.frozen = unfreeze;
						dieValue = frozenValue;
					}
}