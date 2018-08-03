import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
	public static void main(String[] args) {
		System.out.println("Enter 1 for rock.");
		System.out.println("Enter 2 for paper.");
		System.out.println("Enter 3 for scissor.");
		System.out.println("Enter 4 for score.");
		System.out.println("Press any other key to exit. \n");
		int comp_point = 0, player_point = 0;
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		int comp = ThreadLocalRandom.current().nextInt(1,4);
		if (player == 1 || player == 2 || player == 3) {
			if ((comp == 1 && player == 3) || (comp == 2 && player == 1) || (comp == 3 && player == 2)) {
				comp_point++;
				System.out.print("\nComputer wins with ");
				if (comp == 1)
					System.out.print("rock.");
				else if (comp == 2)
					System.out.print("paper.");
				else
					System.out.print("scissor.");
			}
			else {
				player_point++;
				System.out.print("\nYou win as computer put ");
				if (comp == 1)
					System.out.print("rock.");
				else if (comp == 2)
					System.out.print("paper.");
				else
					System.out.print("scissor.");
			}
		}
		else {
			sc.close();
			return;
		}
		sc.close();
	}
}
