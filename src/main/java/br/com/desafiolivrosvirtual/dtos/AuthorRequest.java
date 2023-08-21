package br.com.desafiolivrosvirtual.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AuthorRequest {
    @NotBlank
    private String name;
    @Email
    private String email;
    @NotBlank
    @Column( precision = 400)
    private String description;
    private LocalDate dateRegister;
}
