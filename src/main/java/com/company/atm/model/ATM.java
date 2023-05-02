package com.company.atm.model;

public class ATM {
    private Integer machineId;
    private Double balance;
    private String location;
    public ATM(){}

    public ATM(Integer machineId, Double balance, String location) {
        this.machineId = machineId;
        this.balance = balance;
        this.location = location;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "machineId=" + machineId +
                ", balance=" + balance +
                ", location='" + location + '\'' +
                '}';
    }
}
