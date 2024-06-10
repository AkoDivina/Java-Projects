//7.18 (Game of Craps) Write an application that runs 1,000,000 games of
//craps (Fig. 6.8 ) and answers the following questions:
//        1. How many games are won on the first roll, second roll, …,
//twentieth roll and after the twentieth roll?
//        2. How many games are lost on the first roll, second roll, …,
//twentieth roll and after the twentieth roll?
//        3. What are the chances of winning at craps? [Note: You should
//discover that craps is one of the fairest casino games. What do
//you suppose this means?]
//        4. What is the average length of a game of craps?
//        5. Do the chances of winning improve with the length of the game?

import java.security.SecureRandom;

public class CrapArrays {
    SecureRandom randomNumbers = new SecureRandom();
    private enum Status {CONTINUE, WON, LOST};
    //constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    public static void main(String[] args) {

    }
}