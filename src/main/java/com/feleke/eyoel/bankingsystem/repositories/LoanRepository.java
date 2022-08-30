package com.feleke.eyoel.bankingsystem.repositories;

import com.feleke.eyoel.bankingsystem.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
