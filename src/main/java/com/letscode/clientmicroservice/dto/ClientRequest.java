package com.letscode.clientmicroservice.dto;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;

@Data
public class ClientRequest {
    @NotBlank(message = "The name cannot be blank")
    private String name;
    @CPF(message = "CPF should be a valid one")
    private String cpf;

}
