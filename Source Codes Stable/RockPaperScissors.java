//Rock, paper scissors game

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
	public static void main(String[] args) {
		int player = 0, comp_point = 0, player_point = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nEnter 1 for rock.");
			System.out.println("Enter 2 for paper.");
			System.out.println("Enter 3 for scissor.");
			System.out.println("Enter 4 for score.");
			System.out.println("Enter 5 to exit. \n");
			player = sc.nextInt();
			int comp = ThreadLocalRandom.current().nextInt(1, 4);
			if ((comp == 1 && player == 3) || (comp == 2 && player == 1) || (comp == 3 && player == 2)) {
				comp_point++;
				System.out.print("\nComputer wins with ");
				if (comp == 1)
					System.out.print("rock.\n");
				else if (comp == 2)
					System.out.print("paper.\n");
				else
					System.out.print("scissor.\n");
			} else if ((player == 1 && comp == 3) || (player == 2 && comp == 1) || (player == 3 && comp == 2)) {
				player_point++;
				System.out.print("\nYou win as computer put ");
				if (comp == 1)
					System.out.print("rock.\n");
				else if (comp == 2)
					System.out.print("paper.\n");
				else
					System.out.print("scissor.\n");
			} else if (player == 4) {
				System.out.println("\nPlayer score is " + player_point);
				System.out.println("Computer score is " + comp_point);
			} else {
				System.out.println("\nHope you enjoyed. See you soon. :)");
				sc.close();
				return;
			}
		} while (player != 5);
		sc.close();
	}
}