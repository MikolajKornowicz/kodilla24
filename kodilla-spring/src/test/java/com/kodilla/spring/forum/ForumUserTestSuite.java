package com.kodilla.spring.forum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {

    @Test
    void testGetUserName () {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //when
        String username = forumUser.getUserName();
        //then
       assertEquals("John Smith", username);
    }

}
