package game;

import game.assets.Assets;
import game.game.GameManager;

public class Launcher {

    public static void main(String[] args){
        Assets.init();
        GameContainer g = new GameContainer(new GameManager());
        g.start();
    }
}
