import java.util.ArrayList;

/**
 * Collection of Cards to form as standard playing card deck.
 * @author mvail
 */
public class DeckOfCards implements DeckOfCardsInterface {
    private ArrayList<Card> deck; //DeckOfCards 'has-a' ArrayList, and 'has-a' Card
    

    @Override
    public void shuffle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shuffle'");
    }

    @Override
    public Card deal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deal'");
    }

    @Override
    public int numDealtCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numDealtCards'");
    }

    @Override
    public int numUndealtCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numUndealtCards'");
    }
    
}
