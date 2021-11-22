package betMoreGameMultipleClassError;

import java.util.Random;
import java.util.Scanner;

public class Player {
	
	private int player_number;
	public boolean user_selected = false;
	public int answer;
	
	Player(String s){
		pick_card();
		/*if (s == "Player_2") {
			shuffle();
		}*/
	}

	private void shuffle() {
		Random random = new Random();	
		
		while (this.user_selected == false) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Do you want to generate a new number? Typ in 1 for yes and 2 for no");
				Scanner scanner = new Scanner(System.in);
				this.answer = scanner.nextInt();
				scanner.close();
				if (this.answer == 2) {
					break;
				}
				this.player_number = random.nextInt(100)+1;
			}
			this.user_selected = true;
		}
		
	}

	private int pick_card() {
		Random random = new Random();	
		Scanner scanner = new Scanner(System.in);
		
		player_number = random.nextInt(100)+1;
		scanner.close();
		return player_number;	
	}

	public int getPlayer_number() {
		return player_number;
	}	
	
	public void setPlayer_number(int player_number) {
		this.player_number = player_number;
	}

	public void start() {
		this.pick_card();
	}
}
