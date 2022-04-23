package com.letscode.clientmicroservice.repository;

import com.letscode.clientmicroservice.dto.ClientResponse;
import com.letscode.clientmicroservice.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByCpf(String cpf);
}
