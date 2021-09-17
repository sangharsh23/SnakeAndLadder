package com.bridgelabz.snake.and.ladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Program");
        int NO_PLAY = 0;
        int is_Ladder = 1;
        int is_Snake = 2;
        int position = 0;


        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("diceNumber is : " + diceNumber);

        int option = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println("selected player option : " + option);

        switch (option) {
            case 1:
                position = diceNumber + position;
                System.out.println("position for the player after the ladder is : " + position);
                break;

            case 2:
                position = position - diceNumber;

                System.out.println("position for the player after the Snake is : " + position);
                break;

            default:
                System.out.println("No play");
        }

    }
}
