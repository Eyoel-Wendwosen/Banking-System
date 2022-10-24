package com.feleke.eyoel.bankingsystem.repositories;

import com.feleke.eyoel.bankingsystem.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends UserRepository<Client> {
}
