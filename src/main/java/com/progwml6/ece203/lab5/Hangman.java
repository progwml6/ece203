package com.progwml6.ece203.lab5;

import java.util.Scanner;

public class Hangman
{

    public static void main (String[] args)
    {
        boolean bailout = false;
        int guesses = 0;

        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine().toLowerCase();
        System.out.println(word1);
        String censored = word1.replaceAll("\\p{L}", "*");
        for (int i = 0; i <= 20; i++)
        {
            System.out.println("");
        }
        System.out.println(censored);
        while (!bailout)
        {
            System.out.println("guess");
            String guess = in.nextLine();
            if (word1.contains(guess) && guess.length() == 1)
            {
                for (int i = 0; i < word1.length(); i++)
                {

                    if (word1.charAt(i) == guess.charAt(0))
                    {
                        if (i == 0)
                            censored = guess + censored.substring(1);
                        else
                            censored = censored.substring(0, i - 1) + guess + censored.substring(i + 1);
                    }
                }
            }
            else
            {
                guesses++;
                System.out.println("lolnope " + guesses);
            }
            System.out.println(censored);
            if (censored.equals(word1))
            {
                bailout = true;
                System.out.println("Winner!");
            }
            if (guesses == 6)
            {
                bailout = true;
                System.out.println("Noob!");
            }
        }

    }
}
