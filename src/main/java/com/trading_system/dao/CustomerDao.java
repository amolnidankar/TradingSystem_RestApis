package com.trading_system.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.trading_system.entities.Customer;


@Service
public interface CustomerDao extends JpaRepository<Customer, Long> {
}
