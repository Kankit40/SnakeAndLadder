package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int dice = (int)(Math.random() * 6);

        if(dice ==1) {
            System.out.println("The output is One");
        }else if(dice ==2) {
            System.out.println("The output is Two");
        }else if(dice ==3) {
            System.out.println("The output is Three");
        }else if(dice ==4) {
            System.out.println("The output is Four");
        }else if(dice ==5) {
            System.out.println("The output is Five");
        }else {
            System.out.println("The output is Six");
        }
    }
}
