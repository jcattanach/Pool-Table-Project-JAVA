package com.jcattanach;

import java.util.ArrayList;

public class TablesList {
    private ArrayList<PoolTable> poolTableList;

    public TablesList() {
        this.poolTableList = new ArrayList<PoolTable>();

        this.initializeTables();
    }

    private void initializeTables() {
        for (int i = 0; i < 12; i++) {
            poolTableList.add(i, new PoolTable(i + 1));
        }
    }

    public void showAllTables(){
        System.out.println("******* ALL TABLES ********");
        for (int i = 0; i < this.poolTableList.size(); i++) {
            System.out.println(poolTableList.get(i).toString());
        }
    }

    public void showOpenTables(){
        System.out.println("******* OPEN TABLES ********");
        for (int i = 0; i < this.poolTableList.size(); i++) {
            if(!poolTableList.get(i).getOccupied()){
                System.out.println(poolTableList.get(i).toString());
            }
        }
    }

    public void showOccupiedTables(){
        System.out.println("******* OCCUPIED TABLES ********");
        for (int i = 0; i < this.poolTableList.size(); i++) {
            if(poolTableList.get(i).getOccupied()){
                System.out.println(poolTableList.get(i).toString());
            }
        }
    }

    public void changeStatus(int tableNum){
        poolTableList.get(tableNum - 1).setOccupied(!poolTableList.get(tableNum - 1).getOccupied());
    }
}
