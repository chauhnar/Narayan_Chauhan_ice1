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
public class CardHand {
    
     private int handSize = 52;
	public CardGameWeek4[] cards = new CardGameWeek4[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(CardGameWeek4.Suit s: CardGameWeek4.Suit.values())
                {
                    for(CardGameWeek4.Value v: CardGameWeek4.Value.values())
                    {
                        cards[countCards] = (new CardGameWeek4(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}
