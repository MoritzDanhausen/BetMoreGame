/*
 * I tried to set up the program with multiple classes but this causes errors which i am not able to solve
 */

package betMoreGameMultipleClassError;

import java.util.Random;
import java.util.Scanner;

public class Game_Chair {

	public static Player computer = new Player("Computer");
	public static Player player_2 = new Player("Player_2");
	//public static BetMore_Game bet_more_game = new BetMore_Game();
	//public static Shuffle s = new Shuffle();
	
	public static void main(String[] args) {
		computer.start();
		player_2.start();
		System.out.println(computer.getPlayer_number());
		System.out.println(player_2.getPlayer_number());
		player_2.shuffle();
	}

}
