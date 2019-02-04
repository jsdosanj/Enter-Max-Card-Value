import hw2_jasvant_dosanjh.HW2_Jasvant_Dosanjh;
import java.util.*;
import java.util.Random;

public class Card extends HW2_Jasvant_Dosanjh {
        private int maxValue;//this is the highest value a card can have
        private int cardValue;//the current value of the card, that falls between 1 and maxValue
        Random rnd = new Random();
        /* 
    Constructor
    1. The constructor has 1 int parameter representing the maximum card value
    2. Set maxValue to the value of the parameter. (You can assume the user entered a positive integer greater than 0.)
    */
     
    int getCardValue(){
        //return cardValue
        return cardValue;
     }
    public double flipCard(){
        //Set cardValue to a random number between 1 and maxValue inclusive
        return 0;
    }
    public String toString(){
        //return a String representing the instance variables only
        return null;
    }
}