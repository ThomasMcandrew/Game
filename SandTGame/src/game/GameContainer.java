package game;

import game.display.MainFrame;
import game.game.AbstractGame;
import game.input.Input;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameContainer implements Runnable {

    private Thread thread;
    private MainFrame window;
    private Input input;
    private AbstractGame game;
    private boolean running = false;
    private final double UPDATE_CAP = 1.0/60.0;
    private BufferStrategy bs;
    private Graphics g;
    private int width = 320,height=240;
    private float scale = 4f;
    private String title = "Game";


    public GameContainer(AbstractGame game){
        this.game = game;
    }


    public void start(){
        window = new MainFrame(this);
        input = new Input(this);
        thread = new Thread(this);
        thread.run();
    }
    public void stop(){

    }
    public void run(){
        running = true;

        boolean render = false;
        double firstTime = 0;
        double lastTime = System.nanoTime() / 1000000000.0;
        double passedTime = 0;
        double unprocessedTime = 0;

        double frameTime = 0;
        int frames = 0;
        int fps = 0;

        while(running){
            render = false;
            firstTime = System.nanoTime() / 1000000000.0;
            passedTime = firstTime - lastTime;
            lastTime = firstTime;

            unprocessedTime += passedTime;
            frameTime += passedTime;

            while(unprocessedTime >= UPDATE_CAP){
                unprocessedTime -= UPDATE_CAP;
                render = true;

                game.update(this,(float)UPDATE_CAP);
                input.update();


                if(frameTime >= 1.0){
                    frameTime = 0;
                    fps = frames;
                    frames = 0;
                    System.out.println("FPS" + fps);
                }

            }
            if(render) {
                //renderer.clear();

                bs = window.getCanvas().getBufferStrategy();
                if (bs == null) {
                    window.getCanvas().createBufferStrategy(3);

                } else {
                    g = bs.getDrawGraphics();
                    //Clear Screen
                    g.clearRect(0, 0, (int)(width * scale), (int)(height * scale));
                    //Draw Here!

                    game.render(this, g);

                    //End Drawing!
                    bs.show();
                    g.dispose();
                    frames++;
                }
            }
            else{
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        dispose();
    }
    private void dispose(){

    }

    public MainFrame getWindow() {
        return window;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Input getInput() {
        return input;
    }
}
