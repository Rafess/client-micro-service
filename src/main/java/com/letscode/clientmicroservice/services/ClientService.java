package com.letscode.clientmicroservice.services;

import com.letscode.clientmicroservice.dto.ClientRequest;
import com.letscode.clientmicroservice.dto.ClientResponse;
import com.letscode.clientmicroservice.entities.Client;
import com.letscode.clientmicroservice.exceptions.ClientAlreadyExistsException;
import com.letscode.clientmicroservice.exceptions.ClientNotFoundException;
import com.letscode.clientmicroservice.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientResponse create(ClientRequest clientRequest) {
        if (clientRepository.findByCpf(clientRequest.getCpf()).isEmpty()) {
            Client client = new Client();
            client.setName(clientRequest.getName());
            client.setCpf(clientRequest.getCpf());
            clientRepository.save(client);
            return ClientResponse.fromRequest(clientRequest);
        } else {
            throw new ClientAlreadyExistsException();
        }
    }

    public ClientResponse getClient(String cpf) {
       Client client = clientRepository.findByCpf(cpf).orElseThrow(ClientNotFoundException::new);
       return ClientResponse.convertToResponse(client);
    }
}
