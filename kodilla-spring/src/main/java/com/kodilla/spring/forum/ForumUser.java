package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private final String userName = "John Smith";

    public ForumUser() {
    }

    public String getUserName() {
        return userName;
    }
}
