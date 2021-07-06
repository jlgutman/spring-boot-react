package com.springbootreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootreact.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

