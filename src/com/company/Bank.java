package com.company;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public void addNewBranch(Branch branch, Customer customer) {
        branches.add(branch);

    }
}
