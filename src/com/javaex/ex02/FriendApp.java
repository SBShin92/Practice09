package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Friend> myFriends = new ArrayList<>();
        String inputLine;
        String[] splitLine;


        System.out.println("친구를 3명 등록해 주세요");
        for (int i = 0; i < 3; i++) {
            inputLine = sc.nextLine().trim();
            splitLine = inputLine.split("\\s+");
            // isValue?? 넣긴 해야 되는데...
            Friend tmp = new Friend();
            tmp.setName(splitLine[0]);
            tmp.setHp(splitLine[1]);
            tmp.setSchool(splitLine[2]);
            myFriends.add(tmp);
        }

        for (Friend node: myFriends) {
            System.out.println(node);
        }

    	sc.close();
    }

}
