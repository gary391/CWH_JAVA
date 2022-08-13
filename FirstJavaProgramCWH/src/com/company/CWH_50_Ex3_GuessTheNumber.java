package com.company;
import java.util.Random;
import java.util.Scanner;
class Game{

    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    // Constructor
    Game(){
       Random rand = new Random();
       this.number = rand.nextInt(100);
        System.out.println("The Random Number is: "+ number);

    }
    void takeUserInput(){
        System.out.println("This is a Guess the Number Game, please enter a number:");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }

    //Detect number entered by the user
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("Yes you guessed it right, it was %d.\nyou took %d guess attempt." , number, noOfGuesses );
            return true;
        }
        else if (inputNumber>number){
            System.out.println("The number is too high: ");
        }else if (inputNumber<number){
            System.out.println("The number is low high: ");
        }
        return false;
    }

    // getter or accessor method
    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    //setter method
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses= noOfGuesses;
    }
}
public class CWH_50_Ex3_GuessTheNumber {
    public static void main(String[] args) {
        /*
        Create a class Game, that allows a user to play "Guess the number once"
        Game should have the following method
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true.
        4. getter and setter for noOfGuesses

        Use properties
        noOfGuesses(int) initialize at 0
         */
        Game g = new Game();
        // Initialize a variable name myGuess
        boolean myGuess = false;
        while (!myGuess) {
            g.takeUserInput();// Method to get the input from the user
            myGuess = g.isCorrectNumber(); // As along as isCorrectNumber is false this will continue
//            System.out.println(b);
        }
    }
}

