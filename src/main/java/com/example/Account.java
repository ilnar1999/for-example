package com.example;

import java.io.Serializable;

public class Account implements Serializable {
    private Long id;
    private String customerName;
    private Long balance;

    public Account(Long id, String customerName, Long balance) {
        this.id = id;
        this.customerName = customerName;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
