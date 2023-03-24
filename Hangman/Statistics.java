
public class Statistics {
	private int games;
	private int wins;

	public Statistics() {
		games = 0;
		wins = 0;
	}

	public int getgames() {
		return games;
	}

	public int getwins() {
		return wins;
	}

	public int getloses() {
		return games - wins;
	}

	public void setwins() {
		wins++;
	}

	public void setgames() {
		games++;
	}

	public void showstatistics() {
		int loses = games - wins;
		System.out.println("You have played " + games + " games. You have won " + wins + " times and you have lost "
				+ loses + " times.");
	}
}
