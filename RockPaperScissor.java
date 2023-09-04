import java.util.*;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = 1;
		System.out.println();
		System.out.println("***********Stone Paper Scissors Game***********");
		System.out.println();

		while (true) {
			System.out.println();
			System.out.println("******************* Round " + round++ + " *******************");
			System.out.println();
			String[] options = { "rock", "paper", "scissors" };
			String computer = options[new Random().nextInt(options.length)];
			String user;

			System.out.println("Computer has chosen it's move.");
			System.out.println();
			System.out.println("Now it's your turn to choose. Good Luck!");
			System.out.println();
			while (true) {
				System.out.println("Choose from following moves : 'rock' 'paper' 'scissors'");
				System.out.println("Enter your move: ");
				user = sc.nextLine();

				if (user.equals("rock") || user.equals("paper") || user.equals("scissors")) {
					System.out.println();
					break;
				}

				System.out.println();
				System.out.println("Invalid Move!!");
				System.out.println("Please enter the move from the available moves only!");
				System.out.println();
			}

			System.out.println("Computer chose: " + computer);

			if (user.equals(computer)) {
				System.out.println("Its a tie!");
			}

			else if (user.equals("rock")) {

				if (computer.equals("paper")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				} else if (computer.equals("scissors")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				}
			}

			else if (user.equals("paper")) {

				if (computer.equals("rock")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} else if (computer.equals("scissors")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}

			else if (user.equals("scissors")) {

				if (computer.equals("paper")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} else if (computer.equals("rock")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}

			System.out.println();
			String playAgain;
			System.out.print("Do you want to play again?(y/n) ");

			while (true) {
				playAgain = sc.next();

				if (playAgain.equals("y") || playAgain.equals("n")) {
					break;
				}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
			}

			if (playAgain.equals("n")) {
				break;
			}
		}
		sc.close();
	}
}