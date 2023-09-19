package br.com.desafiolivrosvirtual.controller;

import br.com.desafiolivrosvirtual.model.Author;
import br.com.desafiolivrosvirtual.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid Author author,  UriComponentsBuilder uriBuilder){
        Author newAuthor = authorService.create(author);
        URI endereco = uriBuilder.path("/author").buildAndExpand().toUri();
        return ResponseEntity.created(endereco).body(author);
    }
}
