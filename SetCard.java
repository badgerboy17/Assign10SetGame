/**
 * Name: Bryce Sulin (sulin) 
 * Course: CSCI-241 - Computer Science I
 * Section: 001
 * Assignment: 10
 * 
 * Program Description:
 * This class models individual set cards.
 * It holds the attribute features of each card.
 * 
 * Known Bugs: none.
 */
public class SetCard
{
    // declare instance variables
    private String color;
    private String symbol;
    private int number;
    private String shading;

    /**
     * Constructor for objects of class SetCard. Contains 4 parameters.
     * Sets instance variables equal to the parameters.
     */
    public SetCard(String color, String symbol, int number, String shading)
    {
        // initialise instance variables
        this.color = color;
        this.symbol = symbol;
        this.number = number;
        this.shading = shading;
    }

    /**
     * Getter method getColor() returns a String.
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Getter method getSymbol() returns a String.
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * Getter method getNumber() returns an Integer.
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * Getter method getShading() returns a String.
     */
    public String getShading()
    {
        return shading;
    }

    /**
     * The method toString() neatly formats the card's contents on a single line
     * and returns them as a String.
     */
    public String toString()
    {
        String cardFormat = String.format("%7s %9s %2d %5s", color, symbol, number, shading);
        return cardFormat;
    }
}