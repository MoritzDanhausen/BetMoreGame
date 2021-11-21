package betMoreGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int player_1 = random.nextInt(100)+1;
		int player_2 = random.nextInt(100)+1;
		
		boolean user_selected = false;
		int answer;

		
		while (user_selected == false) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Your current drawn number is: "+player_2);
				System.out.println("Do you want to generate a new number? Typ in 1 for yes and 2 for no");
				
				answer = scanner.nextInt();
				System.out.println(answer);		
				
				if (answer == 2) {
					break;
				}
				
				
				player_2 = random.nextInt(100)+1;
			}
			user_selected = true;
		}
		
		scanner.close();
		
		if (player_1 > player_2) {
			System.out.println("Player_1 has won: "+player_1+" is higher than "+player_2);
		}else if (player_1 == player_2){
			System.out.println("Player_1 and Player_2 have the same number: "+player_1);
		}else {
			System.out.println("Player_2 has won: "+player_2+" is higher than "+player_1);
		}

	}

}
