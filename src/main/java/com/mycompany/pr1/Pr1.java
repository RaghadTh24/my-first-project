/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr1;
import java.util.Scanner;
/**
 *
 * @author Raghad
 */
public class Pr1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        

        // Print the greeting with the user's name and age
        System.out.println("Hello " + name + " I am raghad, This is my first project");

        // Close the scanner to prevent resource leak
        scanner.close();

    }
}