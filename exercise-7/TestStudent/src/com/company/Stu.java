package com.company;

public class Stu {	private String name;
    private String sex;
    private int age;
    private int number;
    public Stu(){
        name="未命名学生";
        sex="男";
        age=18;
    }
    public Stu(String name,String sex,int age,int number){
        this.name =name;
        this.sex=sex;
        this.age=age;
        this.number=number;
    }
    public void show(){
        System.out.println("名字："+this.name +"性别："+this.sex+"学号："+this.number+"年龄："+this.age);
    }

}


