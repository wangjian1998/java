package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.setAccount(1102);
        bank.setAccountName("zhubajie");
        bank.setAccountAdress("gaolaozhuang");
        System.out.println("您的账号为："+bank.getAccount());
        System.out.println("您的账号姓名为："+bank.getAccountName());
        System.out.println("您的地址为："+bank.getAccountAdress());
        User user=new User();
        user.setDeposit(1000);
        System.out.println("您现在账户余额："+user.getDeposit());
        user.setIn(300);
        System.out.println("存款："+user.getIn());
        user.setOut(200);
        System.out.println("取款："+user.getOut());
       user.getRemain();
        // write your code here
    }
}

