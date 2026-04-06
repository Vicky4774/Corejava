package com.jbk;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Login Page...!");
        System.out.println("Enter 1 For Login");
        System.out.println("Enter 2 For Invalid Password");
      

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                //System.out.println("Welcome To The Login Page.....!");

                System.out.println("Enter User Name Here..");
                String username = sc.nextLine();

                System.out.println("Enter Password Here..");
                int password = sc.nextInt();

                
                if (username.equals("vicky") && password == 1234) {
                    System.out.println("Login Successful...");
                } else {
                    System.out.println("Login Unsuccessful...");
                }
                break;

            case 2:
                System.out.println("Invalid Password");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}