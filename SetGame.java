/**
 * Name: Bryce Sulin (sulin) 
 * Course: CSCI-241 - Computer Science I
 * Section: 001
 * Assignment: 10
 * 
 * Program Description:
 * This class actually runs the Game of Set card game.
 * 
 * Known Bugs: none.
 */

import java.util.*;

public class SetGame
{

    /**
     * This method returns true if the three parameter cards form a set, false, otherwise.
     * I used if-statements to check all possible combinations that would return true.
     */
    public static boolean isSet (SetCard card1, SetCard card2, SetCard card3)
    {
        boolean check = false;
        boolean checkColor = false;
        boolean checkSymbol = false;
        boolean checkNumber = false;
        boolean checkShading = false;
        {
            String c1Color = card1.getColor();
            String c2Color = card2.getColor();
            String c3Color = card3.getColor();
            String c1Symbol = card1.getSymbol();
            String c2Symbol = card2.getSymbol();
            String c3Symbol = card3.getSymbol();
            String c1Shading = card1.getShading();
            String c2Shading = card2.getShading();
            String c3Shading = card3.getShading();
            c1Color.equals(c2Color);
            if ((c1Color.equals(c2Color)
                && c2Color.equals(c3Color))
            || (!c1Color.equals(c2Color)
                && !c2Color.equals(c3Color)
                && !c1Color.equals(c3Color)))
            {
                checkColor = true;
            }

            if ((c1Symbol.equals(c2Symbol)
                && c2Symbol.equals(c3Symbol))
            || (!c1Symbol.equals(c2Symbol)
                && !c2Symbol.equals(c3Symbol)
                && !c1Symbol.equals(c3Symbol)))
            {
                checkSymbol = true;
            }

            if ((card1.getNumber() == card2.getNumber()
                && card2.getNumber() == card3.getNumber())
            || (card1.getNumber() != card2.getNumber()
                && card2.getNumber() != card3.getNumber()
                && card1.getNumber() != card3.getNumber()))
            {
                checkNumber = true;
            }

            if ((c1Shading.equals(c2Shading)
                && c2Shading.equals(c3Shading))
            || (!c1Shading.equals(c2Shading)
                && !c2Shading.equals(c3Shading)
                && !c1Shading.equals(c3Shading)))
            {
                checkShading = true;
            }

            if (checkColor == true && checkSymbol == true &&
            checkNumber == true && checkShading == true)
            {
                check = true;
            }
            return check;
        }
    }

    /**
     * This method should find and print all sets in the board array.
     * I used 3 nested for loops to check
     * all card combinations for sets and printed them.
     */
    public static void findSets (SetCard [] board)
    {
        SetCard card1, card2, card3;
        for (int a = 0; a < board.length; a++) 
        {
            card1 = board[a];
            for (int b = a + 1; b < board.length; b++) 
            {
                card2 = board[b];
                for (int c = b + 1; c < board.length; c++) 
                {
                    card3 = board[c];
                    boolean setC = isSet(card1, card2, card3);
                    System.out.println("Found a set!" + " " + a + " " + b + " " + c);
                    System.out.println("Cards in this set are: ");
                    System.out.println(board[a]);
                    System.out.println(board[b]);
                    System.out.println(board[c]);
                    System.out.println();
                }
            }
        }
    }

    /**
     * The main method should do the following. 
     * 1) Declare an array of size 12 of SetCards named board.
     * 2) Instantiate a deck of set cards.
     * 3) Shuffle the deck.
     * 4) Deal 12 cards from the deck into the board.
     * 5) Print the board.
     * 6) Find and print all sets in the board array.
     */
    public static void main (String [] args)
    {
        SetCard [] board;
        board = new SetCard [12];
        SetDeck obj = new SetDeck(); 
        obj.shuffle();
        int i;
        for (i = 0; i < 12; i++)
        {
            board[i] = obj.dealTopCard();
            System.out.println(board[i]);
        }
        System.out.println();
        findSets(board);
    }
}