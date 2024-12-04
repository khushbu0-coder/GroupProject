/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author khush
 */
import java.util.ArrayList;  

/**  
 * Abstract class representing a generic Game.  
 * This class follows the **Single Responsibility Principle** as it focuses solely on game-related logic.  
 */  
public abstract class Game {  
    private final String name; // the title of the game  
    private ArrayList<Player> players; // the players of the game  

    public Game(String name) {  
        this.name = name;  
        players = new ArrayList<>(); // Initialize with type safety  
    }  

    public String getName() {  
        return name;  
    }  

    public ArrayList<Player> getPlayers() {  
        return players;  
    }  

    public void setPlayers(ArrayList<Player> players) {  
        this.players = players;  
    }  

    public abstract void play();  
    public abstract void declareWinner();  
}  