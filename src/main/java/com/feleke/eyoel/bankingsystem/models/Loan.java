package com.feleke.eyoel.bankingsystem.models;

import javax.persistence.*;

@Entity
@Table
public class Loan {

    @SequenceGenerator(
            name = "loan_id",
            sequenceName = "loan_id",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "loan_id",
            strategy = GenerationType.AUTO
    )
    @Id
    private Long Id;
    @OneToOne
    private Balance principal;
    @OneToOne
    private Balance paidAmount;
    private Double interestRate;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Loan(Balance principal, Balance paidAmount, Double interestRate) {
        this.principal = principal;
        this.paidAmount = paidAmount;
        this.interestRate = interestRate;
    }

    public Loan() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Balance getPrincipal() {
        return principal;
    }

    public void setPrincipal(Balance principal) {
        this.principal = principal;
    }

    public Balance getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Balance paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
