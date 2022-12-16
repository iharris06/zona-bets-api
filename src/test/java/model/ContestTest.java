package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContestTest {

    private String expectedTitle = "Blue Jays VS Giants";
    private String expectedResult = "Blue Jays";

    @Test
    public void createContestWithTitle_ShouldInitialize(){
        Contest contest = new Contest(expectedTitle);

        assertEquals(contest.getTitle(),expectedTitle);
    }

    @Test
    public void createContestWithTitleAndResult_ShouldInitialize(){
        Contest contest = new Contest(expectedTitle, expectedResult);

        assertEquals(contest.getTitle(),expectedTitle);
        assertEquals(contest.getResult(),expectedResult);
    }
}