/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliverable;

import java.util.ArrayList;

/**
 *
 * @author khush
 */
public class Deliverable {

     /**  
     * @param args the command line arguments  
     */  
    public static void main(String[] args) {  
        // Create players for the Go Fish game  
        ArrayList<GoFishPlayer> players = new ArrayList<>();  
        players.add(new GoFishPlayer("Alice"));  
        players.add(new GoFishPlayer("Bob"));  
        players.add(new GoFishPlayer("Charlie"));  
        players.add(new GoFishPlayer("Diana"));  

        // Create a Go Fish game instance  
        GoFishGame game = new GoFishGame("Go Fish", players);  

        // Start the game  
        game.play();  
    }  
    
}
