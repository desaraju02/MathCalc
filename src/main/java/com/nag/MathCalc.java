package com.nag;

public class MathCalc {

    public static void main(String[] args) {
        System.out.println(new MathCalc().isEven(4));
    }

    public boolean isEven(int n){
        return n%2==0?true:false;
    }

}
