import java.awt.CardLayout;

/*
 * use example of enumeration and for each loop
 */

public class testClass
{
	/* 
	 * enumeration allows us to define set values for meaningful variable data. defining our own
	 * data type and indicating exactly what data type you are indicating exactly what data values //single line comment oops
	 * that data type can have.
	*/
	

	
	enum  suit {CLUBS, SPADES, DIAMONDS, HEARTS} //comment here
	enum card  {ACE, DUECE, THREE, FOUR, FIVE, SIX, 
			  SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
	
	public static void main(String[] args) 
	{
		//nested for each loop
		for (suit var1: suit.values())
		{
			for (card var2: card.values());
				
		}
		
		int total, /* Amount available */ used;

	}

}
