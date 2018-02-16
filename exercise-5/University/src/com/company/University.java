package com.company;

public class University {
   public void enterRule(double math,double chinese,double english){
       double grade=math+chinese+english;
       if (grade>=220){
           System.out.println("你的分数是："+grade+"达到大学入取最低分数");
       }
       else System.out.println("你的分数是："+grade+"未达到大学入取最低分数");
   }
}
