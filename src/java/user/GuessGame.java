/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author mochan
 */
import java.util.Random;
public class GuessGame {
    // Number that the user is trying to guess
    int num;
    // Number user has guessed
    int guess;
    // Number of tries
    int tries;
    
    // Generate a new number for the user to guess
    public void generateNum() {
        tries = 0;
        allGuesses = "";
    Random randy = new Random();
     num = randy.nextInt(1000);
        
    }
    
    // Getters and setters
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
        allGuesses = allGuesses + guess + "<br>";
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }
    private String allGuesses = " ";

    public String getAllGuesses() {
        return allGuesses;
    }

    public void setAllGuesses(String allGuesses) {
        this.allGuesses = allGuesses;
    }

    
    
}
