package com.feleke.eyoel.bankingsystem.models;

import javax.persistence.*;

@Entity
@Table
public class Balance {

    @SequenceGenerator(
            name = "balance_id",
            sequenceName = "balance_id",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "balance_id",
            strategy = GenerationType.AUTO
    )
    @Id
    private Long id;
    private Double value;

    public Balance(Double value) {
        this.value = value;
    }

    public Balance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
