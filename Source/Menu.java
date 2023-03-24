import java.util.Scanner;

public class Menu {
	private char choice;
	Scanner keyboard = new Scanner(System.in);

	public Menu() {// constructor of Menu
		choice = 0;
	}

	public Menu(char choicee)// player's choice about the Menu
	{
		choice = choicee;
	}

	public char getChoice() {
		return choice;
	}

	public void read() {
		System.out.print(
				"MAIN MENU \n -Start a new Game (G) \n -Statistics (S) \n -Exit (E) \n Please enter your choice: ");
		choice = keyboard.next().charAt(0);
	}

	public boolean rightchoice() {
		if (choice == 'G' || choice == 'g' || choice == 'S' || choice == 's' || choice == 'E' || choice == 'e')
			return true;
		else {
			System.out.println("None of the stated choices was selected. Please type your choice again. ");
			return false;
		}
	}
}
