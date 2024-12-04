/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author khush
 */
/**  
 * Class representing a Go Fish card.  
 * This class follows the **Liskov Substitution Principle** as it can be used wherever a Card is expected.  
 */  
public class GoFishCard extends Card {  
    private String rank;      
    private String suit;      

    public GoFishCard(String rank, String suit) {  
        this.rank = rank;  
        this.suit = suit;  
    }  

    public String getRank() {  
        return rank;  
    }  

    public String getSuit() {  
        return suit;  
    }  

    @Override  
    public String toString() {  
        return rank + " of " + suit;  
    }  
}  