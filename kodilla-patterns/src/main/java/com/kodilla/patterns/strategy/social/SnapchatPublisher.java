package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String postToMedia (String post) {
        System.out.println("Snap: " + post);
        return "Snap: " + post;
    }
}
