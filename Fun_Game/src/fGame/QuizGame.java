/**
 * 
 */
package fGame;

/**
 * @author HACKSTYGIAN
 *
 */
import java.util.Scanner;
public class QuizGame {

	public static void main(String[] args) {
		
		Scanner MG = new Scanner(System.in);
		
		int level = 1;
		int Score = 20;
		int question = 5;          
		
		System.out.println("                      GUESSING GAME"                              );
		System.out.println("_________________________________________________________________");
		
		
		while(level >= 1) {
			
			
		    System.out.println("level: " + level);
		    System.out.println("");
			System.out.print("What is the number between 25 and 36? ");
			String answer = MG.nextLine();
			if (answer.equalsIgnoreCase("30")) {
				System.out.println("Correct");
				level ++;
				Score ++;
				System.out.println("_________________________________________________________________");
			}else {
				
				System.out.println("Wrong");
				System.out.println("_________________________________________________________________");
			}
			
			
			System.out.println("level: " + level);
		    System.out.println("");
			System.out.print("What is 60 divided by 3? ");
			answer = MG.nextLine();
			if (answer.equalsIgnoreCase("20")) {
				System.out.println("Correct");
				level ++;
				Score ++;
				System.out.println("_________________________________________________________________");
			}else {
				
				System.out.println("Wrong");
				System.out.println("_________________________________________________________________");
			}
			
			
			System.out.println("level: " + level);
		    System.out.println("");
			System.out.print("What is 266 + 592? ");
			answer = MG.nextLine();
			if (answer.equalsIgnoreCase("858")) {
				System.out.println("Correct");
				level ++;
				Score ++;
				System.out.println("_________________________________________________________________");
			}else {
				
				System.out.println("Wrong");
				System.out.println("_________________________________________________________________");
			}
			
			
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("What is the center of the solar system? ");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("sun")) {
					System.out.println("Correct");
					level ++;
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}

				
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("What is the name of the dwarf planet Discovered in February 18, 1930? ");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("pluto")) {
					System.out.println("Correct");
					level ++;
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}
				
				
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("What is the name of the red planet? ");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("mars")) {
					System.out.println("Correct");
					level  ++;
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}
				
				
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("What is the normal temperature of the body? ");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("37")) {
					System.out.println("Correct");
					level ++;
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}
				
				
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("How much water should you drink per day? ");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("8")) {
					System.out.println("Correct");
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}
				
				
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("What does DNA stand for? ");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("Deoxyribonucleic acid")) {
					System.out.println("Correct");
					level ++;
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}
				
				
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("How many bones are in the human body? ");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("206")) {
					System.out.println("Correct");
					level ++;
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}
				
				
				System.out.println("level: " + level);
			    System.out.println("");
				System.out.print("What does USB stand for?");
				answer = MG.nextLine();
				if (answer.equalsIgnoreCase("Universal Serial Bus")) {
					System.out.println("Correct");
					level ++;
					Score ++;
					System.out.println("_________________________________________________________________");
				}else {
					
					System.out.println("Wrong");
					System.out.println("_________________________________________________________________");
				}
//____________________________________________________________________________________________				
				if (question >= 11) {
					System.out.println("");
					System.out.println("End of the game");
					//Score ++;
					System.out.println("Highest level: " + level);
					System.out.println("Highest score: " + Score);
				}
				if (level == 11) {
					
					System.out.println("Please restart the game!");
					break;
				}else{
					
					//Score--;
					System.out.println("Highest level: " + level);
					System.out.println("Highest score: " + Score);
					System.out.println("No more question left");
					System.out.println("Please restart the game!");
					break;
//____________________________________________________________________________________________					
			
				
	
	
   }
  }
 }
}
