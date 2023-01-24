package com.alextest.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alextest.payroll.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
