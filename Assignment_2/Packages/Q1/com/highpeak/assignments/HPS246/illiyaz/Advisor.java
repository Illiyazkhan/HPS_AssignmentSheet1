package com.highpeak.assignments.HPS246.illiyaz;
public class Advisor {
    String message[] =new String[5];

    public Advisor(String[] message){
        this.message=message;


    }
    public String getAdvice(){
        int m=(int)(Math.random()*5);
        return message[m];
    }
}
