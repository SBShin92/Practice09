package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Goods> goodsList = new ArrayList<>();
        String inputLine;
        String[] splitLine;

        System.out.println("상품을 입력해주세요(종료 q)");
        while (true) {
            inputLine = sc.nextLine();
            if (inputLine.equals("q"))
                break;
            // isValue????    진짜 넣긴 해야하는데 ...
            splitLine = inputLine.split(",");
            Goods tmp = new Goods();
            tmp.setName(splitLine[0]);
            try {
                tmp.setPrice(Integer.parseInt(splitLine[1]));
                tmp.setCount(Integer.parseInt(splitLine[2]));
            } catch (NumberFormatException e) {
                System.err.println("잘못된 입력");
            }
            goodsList.add(tmp);
        }
        System.out.println("[입력완료]");
        Iterator<Goods> iter = goodsList.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Goods tmp = iter.next();
            tmp.informIncoming();
            sum += tmp.getCount();
        }
        System.out.printf("모든 상품의 갯수는 %d개입니다.%n", sum);

        sc.close();
    }
}
