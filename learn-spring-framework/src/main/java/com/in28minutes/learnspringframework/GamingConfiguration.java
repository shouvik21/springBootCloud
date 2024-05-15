package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        // we are writing code to create objects
        var gameRunner= new GameRunner(game);
        return gameRunner;
    }

//
//    //        var game = new MarioGame();
////        var game = new SuperContraGame();
//    var game = new PacmanGame(); //object creaton
//    var gameRunner = new GameRunner(game);//object creatons and wiring of dependencies
//    //v2. gamerunner class is tightly coupled to a specific game, tight coupling
//    //v2. coupling- how much effort is required to change something
//    // v2.1 now gamerunner class is no longer coupled to a specific game, instead it is coupled to a interface
//        gameRunner.run();
}
