package com.jcattanach;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here

        menu();


    }

    public static void menu(){

        TablesList tablesList = new TablesList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("******* MENU *******");
        boolean quit = false;
        while(!quit){
            menuOptions();
            System.out.println("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        tablesList.showAllTables();
                        break;
                    case 2:
                        tablesList.showOpenTables();
                        break;
                    case 3:
                        tablesList.showOccupiedTables();
                        break;
                    case 4:
                        System.out.println("Enter the table number: ");
                        int tableNum = scanner.nextInt();
                        tablesList.changeStatus(tableNum);
                        break;
                    case 6:
                        quit = true;
                        break;
                    default:
                        System.out.println(choice + " is not a valid menu option.");
                }
            } catch (java.util.InputMismatchException e){
                System.out.println("Not a valid option");
                scanner.nextLine();
            }


        }
    }

    public static void menuOptions(){
        System.out.println(
                "********************\n" +
                "1 - to show all tables\n" +
                "2 - to show open tables\n" +
                "3 - to show occupied tables\n" +
                "4 - to change the status of a table\n" +

                "6 - delete current song from playlist");
    }
}
