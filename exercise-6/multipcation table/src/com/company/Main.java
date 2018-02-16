package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("九九乘法表如下：");
        int i,j;
        for (i = 1; i < 10; i++) {
            for(j = 1; j < 10-i; j++)
                System.out.print("\t");
            for (j = i; j >= 1; j--) {
                System.out.print(i + "*" + j + "=" + j * i + "\t");
            }
            System.out.println();
        }


        // write your code here
    }
}
