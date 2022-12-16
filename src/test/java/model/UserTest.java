package model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
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