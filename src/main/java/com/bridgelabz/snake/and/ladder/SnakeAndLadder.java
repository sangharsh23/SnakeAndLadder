package com.bridgelabz.snake.and.ladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Program");

        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("diceNumber is : " + diceNumber);
    }
}
