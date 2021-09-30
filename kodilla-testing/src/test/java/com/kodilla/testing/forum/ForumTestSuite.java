package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForumTestSuite {

    @Test
    void testUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("TheForumUser");
        //When
        String result = simpleUser.getUsername();
        String expectedResult = "TheForumUser";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
