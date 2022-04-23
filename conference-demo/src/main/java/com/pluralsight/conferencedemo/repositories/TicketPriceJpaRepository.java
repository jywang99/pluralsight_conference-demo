package com.pluralsight.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.TicketPrice;

public interface TicketPriceJpaRepository extends JpaRepository<TicketPrice, Long> {
}
