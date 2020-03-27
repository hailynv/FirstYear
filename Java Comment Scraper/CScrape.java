import java.io.*;
import java.util.Scanner;

/*
 * the assumption is made that the user will not have something like
 * java.io.*, as the program will print the line assuming it is a comment.
 * 
*/

public class CScrape 
{

	public static void main(String[] args) 
	{
		//Variables
		String singleLineComment = "//", 
				multiLineCommentStart = "/*",
				multiLineCommentMid = "*",
				multiLineCommentEnd = "*/";	
		int 	lineNum = 1;

		//Getting the file
		System.out.println("Welcome to Comment Scraper.");
		System.out.println("Enter the name or path of the Java file whose comments you'd like to obtain.");
		Scanner keyboard = new Scanner(System.in);		
		String fileName = keyboard.nextLine();

		//Exception handling and file creation
		try
		{
			FileReader reader = new FileReader(fileName);
			Scanner input = new Scanner(reader);

			//File writing
			PrintWriter output = new PrintWriter(fileName.replace(".java", ".txt"));
			output.println("H. Valle Luque - Comment Scraper");
			output.println("");
			while(input.hasNextLine())
			{
				String line = input.nextLine();

				//Single line comment
				if(line.contains(singleLineComment))
				{
					if(!line.contains(multiLineCommentMid)) 
					{
						output.println(lineNum + ": " + line.substring(line.indexOf("//"), line.length()));
					}
				}
				//Multiline comment start
				if(line.contains(multiLineCommentStart))
				{
					if(!line.contains(singleLineComment) && !line.contains(multiLineCommentEnd))
					{
						output.println(lineNum + ": " + line.substring(line.indexOf(multiLineCommentStart), line.length()));
					}
				}
				//Multiline comment mid
				if(line.contains(multiLineCommentMid))
				{
					if(!line.contains(singleLineComment) && !line.contains(multiLineCommentStart) && !line.contains(multiLineCommentEnd))
					{
						output.println(lineNum + ": " + line);
					}
				}
				//Multuiline comment end
				if(line.contains(multiLineCommentEnd))
				{
					if(!line.contains(singleLineComment) && !line.contains(multiLineCommentStart))
					{
						output.println(lineNum + ": " + line);
					}
				}
				//Multiline comment and single line comment
				if(line.contains(singleLineComment) && line.contains(multiLineCommentMid))
				{
					output.println(lineNum + ": " + line);
				}
				//Multiline comment with code before and after it
				if(line.contains(multiLineCommentStart) && line.contains(multiLineCommentEnd))
				{
					if(!line.contains(singleLineComment))
					{
						output.println(lineNum + ": " + line.substring(line.indexOf(multiLineCommentStart), line.indexOf(multiLineCommentEnd)+2));
					}
				}

				//line count
				lineNum++;

			}			

			//Closing stuff
			input.close();
			output.close();	
			keyboard.close();
		}
		catch(FileNotFoundException FNFE)
		{
			System.out.println("Error: " + fileName + " not found.");
			System.exit(0);
		}
		catch(StringIndexOutOfBoundsException SIOOBE)
		{
			System.out.println("Error: String index out of bounds.");
			System.exit(0);
		}

		System.out.println("Comments have been scraped from your file.");		

	}

}
