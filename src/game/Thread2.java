package game;

public class Thread2 extends Thread{
    public void run() {
        Game game = new Game("Tetris");
        game.run();


    }
}
