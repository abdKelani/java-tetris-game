package game;

public class Launcher {
	public static void main(String[] args) {
		Thread game1 = new Thread();
		Thread2 game2 = new Thread2();
        game1.start();
		game2.run();
	}
}
