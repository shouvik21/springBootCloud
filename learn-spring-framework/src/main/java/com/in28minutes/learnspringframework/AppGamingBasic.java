package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasic {

    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        //v2. gamerunner class is tightly coupled to a specific game, tight coupling
        //v2. coupling- how much effort is required to change something
        // v2.1 now gamerunner class is no longer coupled to a specific game, instead it is coupled to a interface
        gameRunner.run();
    }
}
