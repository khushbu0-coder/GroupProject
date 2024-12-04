/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;  

/**  
 * Abstract class representing a generic Card.  
 * This class follows the **Open/Closed Principle** as it can be extended to create different types of cards.  
 */  
public abstract class Card {  
    /**  
     * Students should implement this method for their specific child classes.  
     *  
     * @return a String representation of a card. Could be an UNO card,   
     * a regular playing card, etc.  
     */  
    @Override  
    public abstract String toString();  
}
