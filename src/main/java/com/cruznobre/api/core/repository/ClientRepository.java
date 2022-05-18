package com.cruznobre.api.core.repository;

import com.cruznobre.api.core.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByCpfEquals(String cpf);
    Optional<Client> findByNameIsLikeIgnoreCase(String name);
}