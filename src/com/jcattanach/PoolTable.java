package com.jcattanach;

public class PoolTable {
    private int tableNumber;
    private Boolean occupied;

    public PoolTable(int tableNumber) {
        this.tableNumber = tableNumber;
        this.occupied = false;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    @Override
    public String toString() {
            return "Table " + this.tableNumber + " is " + (this.occupied ? "occupied" : "open");
    }
}
