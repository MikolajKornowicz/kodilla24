package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategy () {
        //given
        Millenials millenials = new Millenials("John Millenial");
        YGeneration yGeneration = new YGeneration("Karen Y");
        ZGeneration zGeneration = new ZGeneration("Chris Z");
        //when
        millenials.post("Useless Twitt");
        String millenialPost = millenials.post("Useless Twitt");
        yGeneration.post("My first post");
        String yGenPost = yGeneration.post("My first post");
        zGeneration.post("Depressed selfie");
        String zGenPost = zGeneration.post("Depressed selfie");
        //then
        Assertions.assertEquals("Twitt: Useless Twitt", millenialPost);
        Assertions.assertEquals("Post to FB: My first post", yGenPost);
        Assertions.assertEquals("Snap: Depressed selfie", zGenPost);
    }

    @Test
    void testIndividualPosting () {
        //given
        Millenials millenials = new Millenials("Mike Oxlong");
        //when
        millenials.setSocialPublisher( new FacebookPublisher());
        millenials.post("I do not use Twitter");
        String millenialPost = millenials.post("I do not use Twitter");
        //then
        Assertions.assertEquals("Post to FB: I do not use Twitter", millenialPost);
    }
}
