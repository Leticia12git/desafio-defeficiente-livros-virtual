package br.com.desafiolivrosvirtual.controller;

import br.com.desafiolivrosvirtual.dtos.AuthorRequest;
import br.com.desafiolivrosvirtual.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid AuthorRequest authorRequest){
        return ResponseEntity.ok(authorRequest);
    }
}
