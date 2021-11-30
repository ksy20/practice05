package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        dollar = 100;
        won = 1000000;
        
        //100만원을 달러로 출력하기
        System.out.println("백만원은: "+CConverter.toDoller(won)+"달러입니다.");

        
        //100달려를 원으로 출력하기
        System.out.println("백달러는: "+CConverter.toKWR(dollar)+"원입니다.");
        
    }

}
