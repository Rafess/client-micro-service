package com.letscode.clientmicroservice.controller;

import com.letscode.clientmicroservice.dto.ClientRequest;
import com.letscode.clientmicroservice.dto.ClientResponse;
import com.letscode.clientmicroservice.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClientResponse createClient(@RequestBody ClientRequest clientRequest) {

        return clientService.create(clientRequest);
    }

    @GetMapping("{cpf}")
    @ResponseStatus(code = HttpStatus.OK)
    public ClientResponse getClient(@PathVariable String cpf) {
        return clientService.getClient(cpf);
    }
}
