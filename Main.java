
public class Main {

	public static void main(String[] args) {

		Menu menu = new Menu();
		Statistics s = new Statistics();
		do {
			do {
				menu.read();

			} while (!(menu.rightchoice()));// checks if a user has selected a choice from the Menu

			if (menu.getChoice() == 'G' || menu.getChoice() == 'g') {
				Hang hang = new Hang();
				int right = 0;

				do {

					do {
						System.out.println("The random word is now:" + hang.getmisWordarray());
						System.out.println("\nYou have " + hang.getlefttries() + " guesses left. ");
						hang.read();
						if (!(hang.isLetter(hang.getletter())))
							System.out.println("You must enter a letter! ");
					} while (!(hang.isLetter(hang.getletter()))); // checks whether player's input is a letter

					if (hang.alreadyput(hang.getletter()))
						System.out.println("You already guessed " + hang.getletter() + "!"); // checks if the player
																								// already guessed this
																								// letter
					else if (hang.letterexists(hang.getletter())) {
						System.out.println("Bravo Correct!!! :) ");
						hang.putletter(hang.getletter());
						right = right + hang.timesexist(hang.getletter());
					} // adds right guesses in order to determine if the player succeeded
					else {
						System.out.println("There are no " + hang.getletter() + "'s in this word. ");
						hang.settries();// increments in order to count the total guesses
					}

					if (!(hang.alreadyput(hang.getletter())))
						hang.putguessletter(hang.getletter());// adds letter to guessarray

				} while (right != hang.getword().length() && hang.getlefttries() > 0);

				if (hang.getlefttries() > 0) {
					System.out.println("Congratulations!! You guessed the word " + hang.getword());
					System.out.println(
							"You made " + right + " correct guesses and " + hang.gettries() + " wrong guesses. ");
					s.setwins();
				} else
					System.out.println("You lost :( The word was " + hang.getword());
				s.setgames();
			}

			if (menu.getChoice() == 's' || menu.getChoice() == 'S')
				s.showstatistics();
		}

		while (menu.getChoice() != 'E' && menu.getChoice() != 'e');

	}
}