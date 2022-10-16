package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {
        // Initiating new Game instance
        Game game = new Game(10);
        int gamesPlayed = 0;

        if(gamesPlayed == 0){
            // Checking if the game has started
            while(!game.isStarted()){
                System.out.println("Game 1");
            }

            // Changing to the game screen if started
            game.changeToGameScreen();
            gamesPlayed++;
        }

        if(gamesPlayed == 1){
            // Checking if the game has started
            while(!game.isStarted()){
                System.out.println("Game 2");
            }

            // Changing to the game screen if started
            game.changeToGameScreen();
        }

    }
}
