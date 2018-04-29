package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<ForumUser> initList = new ArrayList<>();
        initList.add(new ForumUser(1,"ash",'M',
                LocalDate.of(2001,9,17),2));
        initList.add(new ForumUser(2,"nazg",'F',
                LocalDate.of(1992,4,19),3));
        initList.add(new ForumUser(3,"durb",'M',
                LocalDate.of(1975,2,9),5));
        initList.add(new ForumUser(4,"gimb",'F',
                LocalDate.of(1988,12,31),7));
        initList.add(new ForumUser(5,"thrak",'M',
                LocalDate.of(1968,10,15),11));
        initList.add(new ForumUser(6,"burzum",'F',
                LocalDate.of(1984,1,3),13));
        Forum forum = new Forum(initList);

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(u -> u.getSex() =='M')
                .filter(u -> Period.between(u.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(u -> u.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUniqeID, u -> u));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
