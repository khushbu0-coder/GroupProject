/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

import java.util.ArrayList;

/**
 *
 * @author khush
 */
/**  
 * Abstract class representing a generic Player.  
 * This class follows the **Open/Closed Principle** as it can be extended to create different types of players.  
 */  
public abstract class Player {  
    private String name;   

    public Player(String name) {  
        this.name = name;  
    }  

    public String getName() {  
        return name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }  

    public abstract void play(ArrayList<Player> players);  
}  