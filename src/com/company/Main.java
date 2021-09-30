package com.company;
import java.util.Objects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        // makes alphabet
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (97 + i);
        }
        // user input
        System.out.println("type in a letter and a number in form A1");
        String userInput = input.next();
        // get letter
        char letter = userInput.charAt(0);

        // gets number
        String number = userInput.substring(1);

        int move = Integer.valueOf(number);

        //finds letter
        int letterPos = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (Objects.equals(letter, alphabet[i])) {
                letterPos = i;


            }
        }

        String output = "";
        int loop =1;
        for (int i = letterPos;loop <= move; i--){
            if (i == -1){
                i = 25;
            }
            String myStr = String.valueOf(alphabet[i]);
            output= output + myStr;
            loop = loop + 1;
        }
        System.out.println(output);
    }


}
