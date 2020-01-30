/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameweek4;

/**
 *
 * @author Dell
 */
public class GamePlayer {
  
    
    	public static void main(String[] args) {
		CardHand ch = new CardHand();
                ch.generateHand();
                for(CardGameWeek4 c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
	}

}
