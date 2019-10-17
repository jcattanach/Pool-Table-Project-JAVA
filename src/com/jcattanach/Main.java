package com.jcattanach;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TablesList tablesList = new TablesList();

        tablesList.changeStatus(3);
        tablesList.changeStatus(5);

        tablesList.showOpenTables();
        tablesList.showOccupiedTables();

        tablesList.showAllTables();


    }
}
