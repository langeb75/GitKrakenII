package com.company;

public class Main {

    public static void countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + (i * i);
        }
        System.out.println(total);
    }

    public static void rollASix() {
        int rollDice = 0;

        while (rollDice != 6) {
            rollDice = (int) (Math.random() * 6 + 1);
            System.out.println("You rolled: " + rollDice);

            if (rollDice == 3) {
                break;
            }
        }
        if (rollDice == 6) {
            System.out.println("You Win!!!");
        } else {
            System.out.println("You Lose");
        }

    }
    
    public static double calculateAverage(double [] temperature){
    int size = temperature.length;
    double total = 0;
    for(int i=0; i<size; i++){
        total += temperature[i];
    }
    double average = total/size;
    System.out.println("Average Temperature of the " + size + " readings: " + Math.round(average * 100.0) / 100.0);
    return average;
        
        
    
    
    public static void main(String[] args) {
        //Inner and Outer For Loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer Loop: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("\tInner Loop " + j + ": Hi Everyone!"); // \t will tab for me
            }
        }
        //Call rollASix() Funnction
        rollASix();
        
        //Make an array of temperatures & calculate them after by calling the calculateAverage function
        double [] temperature = {75, 54.48, 76, 89, 56, 78.9};
    calculateAverage(temperature);
        
        //Call countBlocks() Function
        countBlocks(7);
    }


    }

