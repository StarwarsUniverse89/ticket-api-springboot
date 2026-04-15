package com.fmelgoza.apidemo.repository;

import com.fmelgoza.apidemo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}