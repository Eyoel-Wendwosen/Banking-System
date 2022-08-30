package com.feleke.eyoel.bankingsystem.repositories;

import com.feleke.eyoel.bankingsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
