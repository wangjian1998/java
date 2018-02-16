package com.company;

public class Main {

    public static void main(String[] args) {
        Student Wang=new Student();
        Wang.number=10110;
        Wang.tellNumber();
        Wang.weight=70.0;
        Wang.height=180;
        Wang.tellWeightAndHeight();
        int x=3,y=6;
        int result=x+y;
        System.out.printf("Wang会做加法:"+"%d+%d=%d ",x,y,result);
	// write your code here
    }
}
