public class BlackJackReferee
{
    //TODO: List any private variables here that you will need for the Ref to run the game. You shouldn't see the "=" sign
    //      here at all - You are merely declaring variables.





    //TODO: Create a constructor for the ref to do things like creating a deck. This is where you might initialize (i.e.,
    //      give initial values to) the variables you made above.




    public void playGame()
    {
        // TODO: Write this method


    }

    /**
     * determines the number of points associated with this pile of cards.
     * For example:
     * <ul>
     * <li> 3 Hearts, J Clubs, 4 Diamonds --> 17</li>
     * <li> A Spades, K Clubs  --> 21</li>
     * <li> Q Spades, 8 Hearts, A Diamond --> 19</li>
     * </ul>
     * @param pileToScore
     * @return how many points this hand is worth
     * postcondition: The pileToScore should be left in the same condition as it was given by the end of this method.
     */
    public int getScoreForPile(CardPile pileToScore)
    {
        // TODO: I suggest you write this method - I think it will be handy.

        // suggestion: create a temporary, empty cardpile. Deal the cards from the pileToScore into the temp pile one
        //             by one as you calculate the score, and then take them all back.



        return 0; // obviously, replace this with real code.
    }



}
