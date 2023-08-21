package br.com.desafiolivrosvirtual.service;

import br.com.desafiolivrosvirtual.dtos.AuthorRequest;
import br.com.desafiolivrosvirtual.model.Author;
import br.com.desafiolivrosvirtual.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author create(Author author){
        return authorRepository.save(author);
    }
}
