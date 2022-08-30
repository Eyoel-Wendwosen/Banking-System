package com.feleke.eyoel.bankingsystem.models;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table
public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private Set<Teller> tellers;

    public Set<Teller> getTellers() {
        return tellers;
    }

    public void setTellers(Set<Teller> tellers) {
        this.tellers = tellers;
    }
}
