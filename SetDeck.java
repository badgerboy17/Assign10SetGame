/**
 * Name: Bryce Sulin (sulin) 
 * Course: CSCI-241 - Computer Science I
 * Section: 001
 * Assignment: 10
 * 
 * Program Description:
 * This class models a deck of Set cards. This generates a full deck of cards
 * with the attribute features.
 * 
 * Known Bugs: none.
 */

public class SetDeck
{
    // declare instance variables
    private SetCard [] deck;
    private int top;

    /**
     * Constructor for objects of class SetDeck. Contains 2 parameters.
     * Sets instance variables equal to parameters. 
     * I used a for loop and multiple if-statements to assign
     * each feature to the cards in the deck.
     */
    public SetDeck()
    {
        // initialise instance variables
        top = 0;
        deck = new SetCard [81];
        String color2 = "";
        String shape2 = "";
        int number2 = 1;
        String shade2 = "";

        // for loop and if-statements to intialize each array element to a unique card  
        for (int i = 0; i < deck.length; i++)
        {
            if (i < 27)
            {
                color2 = "red ";
            }
            else if (i >= 27 && i < 54)
            {
                color2 = "green ";
            }
            else if (i >= 54 && i < 81)
            {
                color2 = "purple ";
            }

            if (i < 9)
            {
                shape2 = "oval ";
            }
            else if (i < 18 && i >= 9)
            {
                shape2 = "squiggle ";
            }
            else if (i < 27 && i >= 18)
            {
                shape2 = "diamond ";
            }

            if (i < 36 && i >= 27)
            {
                shape2 = "oval ";
            }
            else if (i < 45 && i >= 36)
            {
                shape2 = "squiggle ";
            }
            else if (i < 54 && i >= 45)
            {
                shape2 = "diamond ";
            }

            if (i < 63 && i >= 54)
            {
                shape2 = "oval ";
            }
            else if (i < 72 && i >= 63)
            {
                shape2 = "squiggle ";
            }
            else if (i < 81 && i >= 72)
            {
                shape2 = "diamond ";
            }

            if (i % 3 == 0)
            {
                number2 = 1;
            }
            else if (i % 3 == 1)
            {
                number2 = 2;
            }
            else if (i % 3 == 2)
            {
                number2 = 3;
            }

            if (i < 27)
            {
                shade2 = " solid ";
            }
            else if (i >= 27 && i < 54)
            {
                shade2 = " open ";
            }
            else if (i >= 54 && i < 81)
            {
                shade2 = " lined ";
            }
            deck[i] = new SetCard(color2, shape2, number2, shade2);
        }
    }

    /**
     * The method shuffle() contains a for loop that counts from 0 through 80.
     * It swaps the current card with a random card in the deck.
     */
    public void shuffle()
    {
        for (int i = 0; i < deck.length; i++)
        {
            int random = (int)(Math.random()*(i+1));
            SetCard temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    /**
     * The method dealTopCard() should return the top card in the deck and increment
     * top to the next card.
     */
    public SetCard dealTopCard()
    {
        return deck [top++];
    }

    /**
     * The method isEmpty() should return a boolean as true
     * if top is greater than 80, false otherwise.
     */
    public boolean isEmpty()
    {
        boolean check = false;
        if (top > 80)
        {
            check = true;
        }
        return check;
    }
}