package com.feleke.eyoel.bankingsystem.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Client extends User {

    @SequenceGenerator(
            name = "client_id",
            sequenceName = "client_id",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "client_id",
            strategy = GenerationType.AUTO
    )
    @Id
    private Long id;
    @OneToMany(
            mappedBy = "client"
    )
    private Set<Account> accounts;
    @OneToMany(
            mappedBy = "client"
    )
    private Set<Loan> loan;

    public Client() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Loan> getLoan() {
        return loan;
    }

    public void setLoan(Set<Loan> loan) {
        this.loan = loan;
    }
}
