package com.letscode.clientmicroservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ClientAlreadyExistsException extends RuntimeException{
    public ClientAlreadyExistsException(){
        super("The given Client already exisits");
    }
}
