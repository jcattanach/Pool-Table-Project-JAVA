package com.jcattanach;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PoolTable {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private int tableNumber;
    private Boolean occupied;

    public PoolTable(int tableNumber) {
        this.tableNumber = tableNumber;
        this.occupied = false;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Table " + this.tableNumber + " status changed to " + (this.occupied ? "occupied" : "open") + " @ " + dtf.format(now));
    }

    @Override
    public String toString() {
            return "Table " + this.tableNumber + " is " + (this.occupied ? "occupied" : "open");
    }
}
