package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void informIncoming() {
		System.out.printf("%s(가격:%d원)이 %d 개 입고 되었습니다.%n",
				name, price, count);
	}
}
