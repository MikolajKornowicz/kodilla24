package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{

    @Override
    public String postToMedia (String post) {
        System.out.println("Post to FB: " + post);
        return "Post to FB: " + post;
    }
}
