package com.letscode.clientmicroservice.dto;

import com.letscode.clientmicroservice.entities.Client;
import lombok.Data;

@Data
public class ClientResponse extends ClientRequest{

    public static ClientResponse fromRequest(ClientRequest clientRequest) {
        ClientResponse response = new ClientResponse();
        response.setName(clientRequest.getName());
        response.setCpf(clientRequest.getCpf());
        return response;
    }

    public static ClientResponse convertToResponse(Client client) {
        ClientResponse response = new ClientResponse();
        response.setName(client.getName());
        response.setCpf(client.getCpf());
        return response;
    }
}
