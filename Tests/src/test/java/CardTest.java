import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    void isRed_trueForHeartsAndDiamonds_falseForClubsAndSpades() {
        assertTrue(new Card(Card.Suit.HEARTS).isRed());
        assertTrue(new Card(Card.Suit.DIAMONDS).isRed());
        assertFalse(new Card(Card.Suit.CLUBS).isRed());
        assertFalse(new Card(Card.Suit.SPADES).isRed());
    }
}
