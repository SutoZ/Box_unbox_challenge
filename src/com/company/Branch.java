package com.company;

import java.util.ArrayList;

public class Branch {
    //Branch name is needed

    private String name;

    public String getName() {
        return name;
    }

    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }


    //required good logic! <-- we test if the customer was previously added or not!
    public boolean newCustomer(String customerName, double initialAmount) {
        if (findcustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        else return false;
    }



    /*      findCustomer method is reguired to use!!!
    public void addNewCustomer(Customer customer) {
        if (this.customers.contains(customer)) {
            System.out.println("Customer: " + customer.getName() + " already added.");
        }
        else {
            this.customers.add(customer);
            System.out.println("Customer: " + customer.getName() + " added successfully.");
        }
    }
*/
    public void addInitialTransaction(Customer customer, double transaction) {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).equals(customer)) {
                    customers.get(i).getTransactions().add(transaction);
                    System.out.println("Transaction: " + transaction + " added.");
                }
            }
    }

}
