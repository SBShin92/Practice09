package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FriendApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Friend> myFriends = new ArrayList<>();
        String inputLine;
        String[] splitLine;


        System.out.println("친구를 3명 등록해 주세요 [전화번호는 꼭 'xxx-xxxx-xxxx' 형태로 입력하세요]");
        for (int i = 0; i < 3; i++) {
            inputLine = sc.nextLine();

           splitLine = myRegex(inputLine);
           if (splitLine == null)
               continue;

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

    private static String[] myRegex(String inputLine) {

        Pattern pattern = Pattern.compile("\\s*(\\w+)\\s+([0-9]+-[0-9]+-[0-9]+)\\s+(\\w+)\\s*");
        Matcher matcher = pattern.matcher(inputLine);

        if (matcher.matches()) {
            return new String[]{matcher.group(1),
                    matcher.group(2),
                    matcher.group(3)};
        }
        return null;
    }

}
