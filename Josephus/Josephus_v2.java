/*
 ~open for cool ascii art~

                      |
                      |            .'
                  \   |   /
               `.  .d88b.   .'
                  d888888b
      --     --  (88888888)  --
                  Y888888Y
              .'   `Y88Y'   `.
                  /       \
           .'         !        `.


       .,,-~&,               ,~"~.
      { /___/\`.             > ::::
     { `}'~.~/\ \   ` `     <, ?::;
     {`}'\._/  ) }   ) )     l_  f
      ,__/ l_,'-/  .'.'    ,__}--{_.
     {  `.__.' (          /         }
      \ \    )  )        /          !
       \-\`-'`-'        /  ,    1  J;
  ` `   \ \___l,-_,___.'  /1    !  Y
   ) )   k____-~'-l_____.' |    l /
 .'.'   /===#==\           l     f
      .'        `.         I===I=I
    ,' ,'       `.`.       f     }
  ,' ,'  /      \ `.`.     |     }
.'^.^.^.'`.'`.^.'`.'`.^.   l    Y;
           `.   \          }    |
            !`,  \         |    |
            l /   }       ,1    |
            l/   /        !l   ,l
            /  ,'         ! \    \
           /  /!          !  \    \
    ' '   / ,f l          l___j.   \
   ( (   (_ \l_ `_    ,.-'`--(  `.,'`.
    `.`.  Y\__Y`--'   `-'~x__J    j'  >
                                ,/ ,^'
                               f__J   mab'95

    	  ► STAYIN' ALIVE by the Bee Gees ♪

 */
import java.util.*;

public class Josephus_v2 
{

	public static void main(String[] args) 
	{
		//Variables
		String again = "null";
		Scanner keyboard = new Scanner(System.in);
		Integer groupMem, skipCount, stayinAlive;
		int urDead;		
		boolean success = false;

		//Program introduction
		System.out.println("Josephus - H. Valle Luque");
		System.out.println("");

		do
		{
			//Queue creation
			Queue<Integer> killQueue = new LinkedList<Integer>();

			do
			{
				try
				{								
					System.out.println("How many people are in the group?");
					groupMem = keyboard.nextInt();
					System.out.println("What is the skip count?");
					skipCount = keyboard.nextInt();

					groupMem = new Integer(groupMem);
					skipCount = new Integer(skipCount);				
					success = true;


					//adding everyone to the queue
					for(int idx = 1; idx <= groupMem; idx++)
					{
						killQueue.add(idx);
					}				

					//getting rid of every skipCount person
					while(killQueue.size() > 1)	
					{
						for(int idx = 0; idx < skipCount-1; idx++)
						{
							killQueue.add(killQueue.remove());
						}

						urDead = killQueue.remove();	
					}
					/*
		           	♩		"Whether you're a brother or whether you're a mother
							        You're stayin' alive, stayin' alive"		♩

							    				~ game results ~
					 */
					stayinAlive = killQueue.peek();
					System.out.println("The person in position #" + stayinAlive + " will survive.");	
				}

				catch(InputMismatchException IME)
				{
					System.out.println("Please enter an integer.");
					keyboard.next();
				}
			}
			while(!success);

			//New game?
			System.out.println("Play again [Y/N]?");
			again = keyboard.next();
		}
		while(again.equalsIgnoreCase("y"));

		//Closing the program
		keyboard.close(); 
		System.out.println("♬ Stayin' Alive by the Bee Gees plays ominously in the distance ♬");
		System.out.println("Good luck!");
	}

}
