/*
 * Peter Horne-Deus
 * This program finds palindromes within a sentence
 * Palindrome2.java
 * Febuary 22, 2020
 */
package palindrome2;

import javax.swing.*;
/**
 *
 * @author Peter
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Variables
        String input;
        String reverse = "";
        String test = "";
        String end = "";
        int pal = 0;
        
        //Getting user input
        input = JOptionPane.showInputDialog("A Palinrome is a word that is the same forward and backwards. \n \nPlase enter a sentence (do not use puncuation marks) ");
        
        //Using a loop to check for palindromes on every word
        for (int i = input.length()-1 ; i >= 0; i--){
            //Checking for spaces which signifies the end of a word
            if(input.charAt(i) != ' '){
                //Setting the inputed string to a reverse of the string
                reverse = reverse + input.charAt(i);   
            }
            //Testing if the character is either the last or a space
            if (i == 0 || input.charAt(i) == ' '){
                //Setting the test variable to the forward version of the word in the string
                for(int u = reverse.length()- 1; u >=0; u--){
                    test = test + reverse.charAt(u);
                }

                //Setting both variables to lower case to check if they are the same
                reverse = reverse.toLowerCase();
                test = test.toLowerCase();

                //Testing if the forward and reverse of the word is the same
                if(test.equals(reverse)){
                    pal++;
                    end = end + test + ",";
                }
                //Reseting test and reverse for the next word
                test = "";
                reverse = "";
            }
            
        }
        
        //Checking if the reverse eqauals the forward and is therefore a plaindrome
        if(pal == 0){
            JOptionPane.showMessageDialog(null, "There are no palindromes");
        }
        else{
            JOptionPane.showMessageDialog(null, "There are " + pal + " palindrome(s) \nThe palindrome(s): " + end);
        }
    }
    
}
