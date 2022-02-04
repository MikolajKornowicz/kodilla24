package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{

    @Override
    public String postToMedia (String post){
        System.out.println("Twitt: " + post);
        return "Twitt: " + post;
    }
}
