package com.jokenpo;

import java.util.Scanner;

public class Main {
    private static final String GAME_INTRODUCTION = "The game will start! If you want to exit write 'exit', the game only accepts Rock, Paper and Scissor";

    public static void main(String[] args) {
        System.out.println(GAME_INTRODUCTION);
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (true) {
            String userInputPlayer1 = printMenu(scanner, userInput, "Player 1:");
            String userInputPlayer2 = printMenu(scanner, userInput, "Player 2:");

            if (validateExit(userInputPlayer1, userInputPlayer2)) break;

            executeRule(userInputPlayer1, userInputPlayer2);
        }
    }

    private static String printMenu(Scanner scanner, String userInput, String s) {
        System.out.println(s + userInput);
        return scanner.next();
    }

    private static boolean validateExit(String userInputPlayer1, String userInputPlayer2) {
        if (userInputPlayer1.equals("exit") || userInputPlayer2.equals("exit")) {
            System.out.println("Exiting Jokenpo.");
            return true;
        }
        return false;
    }

    private static void executeRule(String userInputPlayer1, String userInputPlayer2) {
        try {
            Result result = Item
                    .valueOf(userInputPlayer1.toUpperCase())
                    .getRule()
                    .apply(Item.valueOf(userInputPlayer2.toUpperCase()));
            System.out.println("Player 1:" + result);

        } catch (IllegalArgumentException exception) {
            System.out.println("Only accepts: Rock, Paper and Scissor. Try again.");
        } finally {
            System.out.println("-----");
        }
    }
}
