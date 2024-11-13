/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author khush
 */
public class GoFishCard extends Card{

private String rank;      //  2-10 , Jack , Queen , King , Ace 
private String suit;      //hearts , dimaonds , clubs , spades

public GoFishCard(String rank,String suit){
  this.rank = rank;
  this.suit = suit;
}

public String getrank(){
  return rank;
}

public String getsuit(){
  return suit;
}

  @Override
  public String toString(){
    return rank + "of" + suit;
  }

}