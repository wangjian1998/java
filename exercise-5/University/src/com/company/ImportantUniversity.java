package com.company;

public class ImportantUniversity extends University {
    public void ernterRule(double math,double chinese,double english){
        double grade=math+chinese+english;
        if (grade>=245)
            System.out.println("你的分数是："+grade+"达到了重点大学的最低分数");
        else System.out.println("你的分数是："+grade+"未达到重点大学的最低分数");
    }
}
