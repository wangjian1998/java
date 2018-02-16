package com.company;

public class CheapGoods extends Goods {
    public int weight;
    public void newSetWeight(int w){
        weight=w;
        System.out.println("int型weight:"+weight);
    }
    public int newGetPrice(){
        int price=weight*10;
        return price;
    }
}
