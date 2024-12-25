import java.io.*;
import java.util.*;
class TypingSpeedTester
{
	public static void main(String[] args) throws InterruptedException
	 {		
		String [] words={"make","help","than","increase","present","find","large","might","between","people","it","or",
						 "just","want","tell","general","line","never","thing","so","large","out","because","know","and","seconds","end",
						 "back" ,"this", "play","new","off","home","line","you","before","good","real","look","against","still"};


				System.out.println("***************************************************");
				Thread.sleep(1000);
				System.out.println("********** 1 **************");
				Thread.sleep(1000);
				System.out.println("********** 2 **************");
				Thread.sleep(1000);
				System.out.println("********** 3 **************");
				Thread.sleep(1000);
				System.out.println("********** Start **********");


	//using for loop for for printing the words from string and use genrate method to print words randomly.

		System.out.println();
		System.out.println();

			String str="";

		for (int i=0; i<30; i++ )
		{ 	
			str = words[genrateRandom()];
			System.out.print(str + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Start : ");

		//accepting the input from user
		Scanner sc = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		String userTypedWords = sc.nextLine();
		System.out.println(userTypedWords);




		//counting end time  , total time  and convert it into sec 
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		double seconds= totalTime/1000; 
		int numChars = userTypedWords.length();


		//formula for calculating words per minute

		int wpm =(int)((((double)numChars / 5)/seconds)*60);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*****************Your typing speed words per Minute is : "+wpm+" ! **********************************");

		if(str.equals(userTypedWords))
			System.out.println("******************* WOW Your Typing Accuracy is 100% ************************** ");
	}



	public static int genrateRandom()
	{
		for (; ; ) 
		{
			int num = (int)(Math.random()*10);
			if(num>0 && num<41)
				return num;	
		}
	}
}

