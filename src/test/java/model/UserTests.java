package model;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class UserTests {
    private User user;
    private final String expectedName = "Jack Johnson";
    private final double expectedBank = 123.00;

    @Test
    public void user_ShouldInitialize(){
        User user = new User(expectedName);
        assertEquals(user.getName(), expectedName);
        assertEquals(user.getBank(), expectedBank, 0);
    }

}
