package gusessingGame;

import javax.swing.*;
public class GuessingGame {
    public static void main(String[] args){
        int computerNumber = (int)(Math.random()*100+1);
        int userAnswer = 0;
        JOptionPane.showMessageDialog(null, "WELCOME TO GUESSING GAME","Game",3);
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("|                                                               |");
        System.out.println("|           WELCOME TO THE NUMBER GUESSING GAME                 |");         
        System.out.println("|                                                               |");
        System.out.println(" ---------------------------------------------------------------");
        //System.out.println("The correct Guess would be : " +computerNumber);
        int count = 1;
        while(userAnswer != computerNumber)
        {
            String response=JOptionPane.showInputDialog(null, "Enter the guess between 1 to 100","Gusessing Game",3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, " "+determineGuess(userAnswer, computerNumber, count));
            count++;
            System.out.println("You have guessed " + count + " times!");
        }
    }
    /**
     * @param userAnswer
     * @param computerNumber
     * @param count
     * @return
     */
    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if(userAnswer <= 0 || userAnswer >100)
            return "Your Guess is invalid";
        if(userAnswer == computerNumber){
            System.out.println("Correct! \n Total Guesses : "+count);
            switch(count){
                case 1:
                    System.out.println("Your score is 100");
                    break;
                case 2:
                    System.out.println("Your score is 90");
                    break;
                case 3:
                    System.out.println("Your score is 80");
                    break;
                case 4:
                    System.out.println("Your score is 70");
                    break;
                case 5:
                    System.out.println("Your score is 60");
                    break;
                case 6:
                    System.out.println("Your score is 50");
                    break;
                case 7:
                    System.out.println("Your score is 40");
                    break;
                case 8:
                    System.out.println("Your score is 30");
                    break;
                case 9:
                    System.out.println("Your score is 20");
                    break;
                case 10:
                    System.out.println("Your score is 10");
                    break;
                default:
                    System.out.println("Sorry!!!! \n You have exceeded more than 10 attempts \n So Your score is 0!!!! \n Better Luck Next Time, to score better");  
                }
                System.out.println();
                }
        else if(userAnswer > computerNumber)
            return "Your guess is too high,try again \n try Number : "+count;
        else if(userAnswer < computerNumber)
            return "Your guess is too low,try again \n try Number : "+count;
        else
            return "Your guess is incorrect \n Try Number : "+count;
        return "Game Over!!!!!! \n Score is displayed in terminal";
    }

}