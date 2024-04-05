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

        System.out.println("상품을 입력해주세요(종료 q)[ 입력방법>>상품명,가격,갯수 ]");
        while (true) {
            inputLine = sc.nextLine().trim();
            if (inputLine.equals("q"))
                break;
            splitLine = inputLine.split(",");
            Goods tmp = new Goods();
            tmp.setName(splitLine[0].trim());
            try {
                tmp.setPrice(Integer.parseInt(splitLine[1].trim()));
                tmp.setCount(Integer.parseInt(splitLine[2].trim()));
                goodsList.add(tmp);
            } catch (NumberFormatException e) {
                System.err.println("가격, 갯수는 숫자로 입력해주세요");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("잘못 입력했습니다");
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
