package com.example;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

public class lab2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What input is needed, manual or random?(1/0): ");
        int example = scanner.nextInt();

        System.out.print("Input length line array: ");
        int line = scanner.nextInt();

        System.out.print("Input length column array: ");
        int column = scanner.nextInt();

        if(line>20 ){
            line = 20;
            System.out.print("Will be 20");
        }

        if(column>20 ){
            column = 20;
            System.out.print("Will be 20");
        }

        int[][] array = new int[line][column];

        if (example==0){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j]= (int) Math.round((Math.random()*30)-15);
                }
            }
        }

        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("[" + i + "]" + "[" + j + "] ");
                    array[i][j] = scanner.nextInt();
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        //------------------------------------------------------------------------------//
        //System.out.print(Math.max(array[][]));
        int maxValue=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>maxValue){
                maxValue=array[i][j];
                }
            }
        }
        int minValue=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]<minValue){
                    minValue=array[i][j];
                }
            }
        }

        float aveArray=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                aveArray+=array[i][j];
            }
        }

        System.out.print("Max: "+maxValue+"\n");
        System.out.print("Min: "+minValue+"\n");
        System.out.print("Average: "+ aveArray/array.length);
    }
}
