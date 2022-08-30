package com.feleke.eyoel.bankingsystem.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Client extends User {

    @OneToMany(
            mappedBy = "client"
    )
    private Set<Account> accounts;
    @OneToMany(
            mappedBy = "client"
    )
    private Set<Loan> loan;

    @ManyToMany(mappedBy = "clients")
    private Set<Teller> tellers;
    public Client() {
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

    public Set<Teller> getTellers() {
        return tellers;
    }

    public void setTellers(Set<Teller> tellers) {
        this.tellers = tellers;
    }
}
