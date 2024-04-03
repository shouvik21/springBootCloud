package com.in28minutes.learnspringframework.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game= game;
    }

    public void run() {
        System.out.println("Running game : "+game); //not good practice, instead use some logging framework, todo
        game.up();;
        game.down();
        game.left();
        game.right();
    }
}
