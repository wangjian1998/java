package com.company;

public class Main {

    public static void main(String[] args) {
        CheapGoods cheapGoods=new CheapGoods();
        cheapGoods.newSetWeight(120);
        System.out.println("对象cheapGoods的weight:"+cheapGoods.weight);
        System.out.println("cheapGoods的优惠价格是:"+cheapGoods.newGetPrice());
        cheapGoods.oldSetWeight(120.3);
        System.out.println("cheapGoods的原价是:"+cheapGoods.oldGetPrice());
	// write your code here
    }
}
