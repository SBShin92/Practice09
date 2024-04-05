package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Goods> goodsList = new ArrayList<>();
        String inputLine;
        String[] splitLine;

        System.out.println("상품을 입력해주세요(종료 q)[ 입력예시>> LG그램,9000,5 ]");
        while (true) {
            inputLine = sc.nextLine().trim();
            if (inputLine.equals("q"))
                break;
            splitLine = inputLine.split(",");
            Goods tmp = new Goods();
            tmp.setName(splitLine[0]);
            try {
                tmp.setPrice(Integer.parseInt(splitLine[1]));
                tmp.setCount(Integer.parseInt(splitLine[2]));
                goodsList.add(tmp);
            } catch (NumberFormatException e) {
                System.err.println("잘못된 입력");
            }
        }
        System.out.println("[입력완료]");

        int sum = 0;
        for (Goods node: goodsList) {
            node.informIncoming();
            sum += node.getCount();
        }

        System.out.printf("모든 상품의 갯수는 %d개입니다.%n", sum);

        sc.close();
    }
}
