package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> userList = new ArrayList<>();
    public List<ForumUser> getUserList () {
        userList.add(new ForumUser("User1", 'm', LocalDate.of(2001, 1, 1), 1, 1));
        userList.add(new ForumUser("User2", 'f', LocalDate.of(2002, 2, 2), 2, 2));
        userList.add(new ForumUser("User3", 'm', LocalDate.of(2000, 3, 3), 3, 3));
        userList.add(new ForumUser("User4", 'f', LocalDate.of(1998, 4, 1), 4, 4));
        userList.add(new ForumUser("User5", 'm', LocalDate.of(1995, 6, 9), 5, 6));
        userList.add(new ForumUser("User6", 'f', LocalDate.of(1997, 1, 1), 6, 7));
        userList.add(new ForumUser("User7", 'm', LocalDate.of(1995, 1, 1), 7, 9));
        userList.add(new ForumUser("User8", 'f', LocalDate.of(1997, 1, 1), 8, 8));

        return new ArrayList<>(userList);
    }
}
