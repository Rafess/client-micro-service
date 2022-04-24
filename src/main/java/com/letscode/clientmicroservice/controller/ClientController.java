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

    @DeleteMapping("/delete/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteClient(@PathVariable String cpf) {
        clientService.delete(cpf);
    }

    @PutMapping("/update/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public ClientResponse updateClient(@PathVariable String cpf, @RequestBody ClientRequest clientRequest) {
        return clientService.update(cpf, clientRequest);
    }
}
