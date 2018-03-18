import java.io.*;
import java.util.Scanner;
/* GuessingGame.java
 * A program which replicates a guessing game in which user attempts to guess
 * a "random" number.
 * @creator tmd
 * @generated 02018.03.16
 */
 interface I_GG {
    int MIN_NUMBER = 1;
    int MAX_NUMBER = 205;
    int BACKDOOR_NUMBER = -314;
    int DFLT_NUMBER = 60;
    int WON_VALUE = 0;
    int QUIT_VALUE = -1;
    int LOSE_VALUE = -2;
    int MAX_GAMES = 4;
    int MAX_GUESSES = 10;
    int HINT_THRESHOLD = 5;
    char NO = 'n', NO_UPPER = 'N';
    char YES = 'y', YES_UPPER = 'Y';

    String NOPE_MSG = "nope...";
    String NOPE_NOPE_MSG = "you've already guessed that wrong guess...";
    String INVALID_INPUT_BEGIN = "*** invalid input -- ";
    String INPUT_TOO_LOW_MSG = INVALID_INPUT_BEGIN + "must be greater than " +
                               (MIN_NUMBER - 1);
    String INPUT_TOO_HIGH_MSG = INVALID_INPUT_BEGIN + "must be less than " +
                                (MAX_NUMBER + 1);
    String INPUT_NOT_INT_MSG = INVALID_INPUT_BEGIN + "must be an whole number";
    String NOT_YN_MSG = INVALID_INPUT_BEGIN + "must be " + NO + " or " + YES;
    String WINNER_MSG = "you're a winner... # of guesses: ";
    String LOSER_MSG = "too many guesses entered... the number was ";
    String QUITTER_MSG = "you're a quitter... the number was ";
    String MAX_GAMES_PLAYED_MSG = "\nMaximum number (" + MAX_GAMES +
                                  ") of games played.";
    String ENTER_GUESS_PROMPT = "enter a guess between " + MIN_NUMBER +
                                " and " + MAX_NUMBER + " (" + QUIT_VALUE +
                                " to quit): ";
    String PLAY_AGAIN_PROMPT = "\nDo you want to play again (" + NO +
                               " or " + YES + ")? ";

    String BOLD_BEGIN = "*** ";
    String BOLD_END = " ***";
    String PLAY_MSG = " playing the CSC205" + " guessing game." + BOLD_END;
    String WELCOME_MSG = BOLD_BEGIN + "Hello! Have fun" + PLAY_MSG;
    String THANKS_MSG = BOLD_BEGIN + "Thanks for" + PLAY_MSG;
    String GUESSES_DUMP = "...the guesses were: ";
    String WINNER_RESULT = "Won";
    String QUITTER_RESULT = "Quit";
    String LOSER_RESULT = "Lost";

    // printf() format strings...
    String GAME_STATS_FMT = "games played: %d; won: %d; lost: %d; quit: %d;" +
                            " winning pct.: %.2f%%\n";
    String GAME_DUMP_FMT = "game %d: %s; the number was: %d; " +
                       "#guesses: %d; backdoored: %s\n";
 }
 public class GuessingGame implements I_GG {

   public static void main(String[] args){
     int games = 1 ;
     int guesses = 1;
     int game = 1;
     int guess = 1;
     double randum = 0;
     Scanner scan = new Scanner(System.in);

     System.out.println(WELCOME_MSG);

     while(games <= MAX_GAMES){
       randum = Math.floor(Math.random()*(MAX_NUMBER - MIN_NUMBER + 1))
                                 + MIN_NUMBER;
       while(guesses <= MAX_GUESSES ){
        System.out.println(ENTER_GUESS_PROMPT);
        guess = scan.nextInt();
        if(guess == BACKDOOR_NUMBER){
          System.out.println("You found me pot of gold! Here is the actual value: "
                             + randum);
        }else if(guess == randum){
          System.out.println(WINNER_MSG + guesses);
        }else if(guess != randum){
          System.out.println(NOPE_MSG);
          guesses++;
        }
        }
        }
  }
  }
/*  class random implements I_GG{
}*/
