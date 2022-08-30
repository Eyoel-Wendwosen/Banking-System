package com.feleke.eyoel.bankingsystem.models;

import javax.persistence.*;

@Table
@Entity
public class Account {
    @Id
    @SequenceGenerator(
            name = "account_id",
            sequenceName = "account_id",
            allocationSize = 2
    )
    @GeneratedValue(
            generator = "account_id",
            strategy = GenerationType.AUTO
    )
    private Long id;
    private Long accountNumber;
    private Long routingNumber;
    private AccountType type;
    @OneToOne
    private Balance balance;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(Long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
