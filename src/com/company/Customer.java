package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double initialAmount;


    private ArrayList<Double> transactions;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.initialAmount = initialAmount;
    }


    public void addTransaction (double amount) {
        this.transactions.add(amount);
    }
}
