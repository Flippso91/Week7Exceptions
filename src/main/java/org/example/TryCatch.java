package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        int myNum = 0;
        while (myNum == 0) {

            try {
                System.out.println("Please enter a number between 0 - 9");
                Scanner myscan = new Scanner(System.in);
                myNum = myscan.nextInt();

                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You entered " + myNum);
                } else {
                    System.out.println("Not a valid number");
                    myNum = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a number, please enter a valid numner");
            }
        }
    }
}
