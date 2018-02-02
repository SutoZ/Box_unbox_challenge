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
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        } else return false;
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
        Customer cust = findCustomer(customer);
        if (cust != null) {
            //the method is in the Customer class, because it belongs to the customer. Changes are made in that method too.
            cust.addTransaction(transaction);
            System.out.println("Transaction: " + transaction + " added.");
        }
    }
}
