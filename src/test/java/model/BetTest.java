package model;

import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

class BetTest {
    private final UUID personId = UUID.randomUUID();
    private final UUID contestId = UUID.randomUUID();
    private double expectedAmount;
    @Test
    public void createBet_ShouldInitialize(){
        Bet bet = new Bet(personId, contestId, expectedAmount);
        assertEquals(bet.getPersonId(), personId);
        assertEquals(bet.getContestId(), contestId);
        assertEquals(bet.getAmount(), expectedAmount,0);
    }

}