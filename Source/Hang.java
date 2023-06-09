import java.util.Random;
import java.util.Scanner;

public class Hang {
	private int totaltries;
	private int tries;
	private String word;
	private char letter;
	char[] miswordarray;
	char[] wordarray;
	char[] guessarray;
	Scanner keyboard = new Scanner(System.in);
	int counter;

	public Hang() {
		tries = 0;
		Dictionary wordd = new Dictionary();
		Random ran = new Random();
		word = wordd.getWord(ran.nextInt(21));
		totaltries = word.length() + 8;
		letter = 0;
		wordarray = new char[word.length()];
		wordarray = word.toCharArray();
		miswordarray = new char[word.length()];
		for (int i = 0; i < word.length(); i++)
			miswordarray[i] = '-';
		guessarray = new char[26];
		counter = 0;
	}

	public String getword() {
		return word;
	}

	public int gettotaltries() {
		return totaltries;
	}

	public int gettries() {
		return tries;
	}

	public int getlefttries() {
		return totaltries - tries;
	}

	public char getletter() {
		return letter;
	}

	public void read()// reads the player's input
	{
		char l;
		System.out.print("Your choice is: ");
		l = keyboard.next().charAt(0);
		setletter(l);
	}

	public void setletter(char l) {
		letter = l;
	}

	public void settries() {
		tries++;
	}

	public boolean letterexists(char letter) {
		if (word.indexOf(Character.toUpperCase(letter)) == -1)
			return false;
		else
			return true;
	}

	public String getmisWordarray() {
		String string = new String(miswordarray);
		return string;
	}

	public boolean isLetter(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}

	public String getWordarray() {
		String string = new String(wordarray);
		return string;
	}

	public int times_exist(char letter) { // counts how many times a letter exists in the word
		int x = 0;

		for (int i = 0; i < word.length(); i++)
			if ((wordarray[i] == letter) || (wordarray[i] == Character.toUpperCase(letter)))
				x++;
		return x;
	}

	public void putguessletter(char letter) {
		guessarray[counter] = letter;
		counter++;
	}

	public boolean alreadyput(char letter) {// checks if player already guessed this letter
		for (int i = 0; i < 26; i++)
			if ((guessarray[i] == letter) || (guessarray[i] == Character.toUpperCase(letter)))
				return true;
		return false;

	}

	public void putletter(char letter) {// puts the right guess in the missing space of the word

		for (int i = 0; i < word.length(); i++) {
			if ((wordarray[i] == letter) || (wordarray[i] == Character.toUpperCase(letter)))
				miswordarray[i] = letter;
		}
	}

	public String getguessarray() {
		String string = new String(guessarray);
		return string;
	}

}
