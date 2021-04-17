package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("which value you want to found  1.V 2.I 3.R enter number 1,2,3");
        int interValue = sc.nextInt();
        if(interValue == 1){
            System.out.println("enter I value");
            float iVlue = sc.nextFloat();
            System.out.println("enter R value");
            float rValue = sc.nextFloat();
            float vValue = iVlue*rValue;
            System.out.println("voltage = " + vValue);
        }
        else if(interValue == 2){
            System.out.println("enter V value");
            float vVlue1 = sc.nextFloat();
            System.out.println("enter R value");
            float rValue1 = sc.nextFloat();
            float iValue1 = vVlue1/rValue1;
            System.out.println("I = " + iValue1);
        }
        else {
            System.out.println("enter I value");
            float iVlue2 = sc.nextFloat();
            System.out.println("enter V value");
            float vValue2 = sc.nextFloat();
            float rValue2 = vValue2/iVlue2;
            System.out.println("Restence = " + rValue2);
        }

    }
}
