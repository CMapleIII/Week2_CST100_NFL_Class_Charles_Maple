package NFLPlayer;

import java.util.Scanner;

public class NFLPlayer 
{
    private static Scanner input;
	public static void main(String[] args) 
	    {
	        //VARIABLES
	        int answer;
	        
	        input = new Scanner(System.in);
	        
	        //CREATING THE OBJECT
	        Info nflInfo = new Info();
	        
	        //MENU OF THE PROGRAM
	        System.out.println("** WELCOME TO THE CHICAGO BEARS LINEUP! **");
	        System.out.println("CHOOSE THE PLAYER YOU WANT TO VIEW!:");
	        
	        //LIST OF PLAYERS ON THE MAIN MENU THAT WILL APPEAR, GO OFF THIS ROSTER TO CREATE STATS, ETC.
	        //USE CTRL + F TO FIND THE PLAYERS LISTED BELOW FASTER ON YOUR SITE
	        System.out.println("1) Sam_Acho");
	        System.out.println("2) Adrian_Amos");
	        System.out.println("3) Jonathan_Anderson");
	        System.out.println("4) Lamin_Barrow");
	        System.out.println("5) Nick_Becton");
	        System.out.println("6) Josh_Bellamy");
	        System.out.println("7) Omar_Bolden");
	        System.out.println("8) Aaron_Brewer");
	        System.out.println("9) Keith_Browner");
	        System.out.println("10) Bryce_Callahan");
	        
	        //INPUT WILL BE PUT IN VARIABLE ANSWER
	        do
	        {
	        System.out.print("Enter 1-10: ");
	        answer = input.nextInt();
	        
	        //IMPLEMENT OUR IF/ELSE IF STATEMENTS
	        if(answer == 1)
	        {
	            //CALLING THE METHOD IN OTHER CLASS, JUST FILL IN THE ARGS
	            nflInfo.Sam_Acho(answer, answer, answer, answer);
	        }
	        else if(answer == 2)
	        {
	        	nflInfo.Adrian_Amos(answer, answer, answer, answer);
	        }
	        else if(answer == 3)
	        {
	        	nflInfo.Jonathan_Anderson(answer, answer, answer, answer);
	        }
	        else if(answer == 4)
	        {
	        	nflInfo.Lamin_Barrow(answer, answer, answer, answer);
	        }
	        else if(answer == 5)
	        {
	        	nflInfo.Nick_Becton(answer, answer, answer, answer);
	        }
	        else if(answer == 6)
	        {
	        	nflInfo.Josh_Bellamy(answer, answer, answer, answer);
	        }
	        else if(answer == 7)
	        {
	        	nflInfo.Omar_Bolden(answer, answer, answer, answer);
	        }
	        else if(answer == 8)
	        {
	        	nflInfo.Aaron_Brewer(answer, answer, answer, answer);
	        }
	        else if(answer == 9)
	        {
	        	nflInfo.Keith_Browner(answer, answer, answer, answer);
	        }
	        else if(answer == 10)
	        {
	        	nflInfo.Bryce_Callahan(answer, answer, answer, answer);
	        }
	        
	        }while(answer < 1 || answer > 10);
	    }
}
