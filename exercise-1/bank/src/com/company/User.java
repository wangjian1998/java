package com.company;

public class User {
    double deposit;//存款
    double out;
    double in;
    void setDeposit(double d){
        deposit=d;
    }
    double getDeposit() {
        return deposit;
    }

   void setIn(double i){
        in=i;
    }
    double getIn(){
        return in;
    }
    void setOut(double o){
        out=o;
    }
    double getOut(){
        return out;
    }
    double remain;
    double getRemain(){
       return  remain=deposit+in-out;
    }

    }
