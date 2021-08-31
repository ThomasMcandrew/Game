package game;

import game.game.GameManager;

public class Launcher {

    public static void main(String[] args){
        GameContainer g = new GameContainer(new GameManager());
        g.start();
    }
}
