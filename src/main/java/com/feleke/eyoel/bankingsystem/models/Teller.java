package com.feleke.eyoel.bankingsystem.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Teller extends User {
    @JoinTable(
            name = "teller_clients",
            joinColumns = @JoinColumn(name = "teller_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    @ManyToMany
    private Set<Client> clients;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = false)
    private Admin admin;

    public Teller() {
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
