package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {

        int playerPosition = 0;

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

        System.out.println("-------------------------------------");

        int checkPlay = (int)(Math.random() * 3);

        if(checkPlay ==1) {
            System.out.println("The player gets No Play");
            playerPosition += 0;
            System.out.println("The player moves to " + playerPosition);
        }else if(checkPlay ==2) {
            System.out.println("The player gets Ladder");
            playerPosition += dice;
            System.out.println("The player moves to " + playerPosition);
        }else {
            System.out.println("The player gets Snake");
            if(playerPosition<dice) {
                playerPosition += 0;
                System.out.println("The player stays at " + playerPosition);
            }else {
                playerPosition += dice;
                System.out.println("The player moves to " + playerPosition);
            }
        }
    }
}
