package br.com.desafiolivrosvirtual.controller;

import br.com.desafiolivrosvirtual.dtos.TitleRequest;
import br.com.desafiolivrosvirtual.model.Author;
import br.com.desafiolivrosvirtual.model.Title;
import br.com.desafiolivrosvirtual.service.TitleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/title")
public class TitleController {

    @Autowired
    private TitleService titleService;

    @PostMapping
    public ResponseEntity create(@RequestBody @Valid Title titleRequest){
   Title newTitle = titleService.create(titleRequest);
        return ResponseEntity.ok(newTitle);
    }

    @GetMapping
    public List<Title> findAll(@PathVariable long id, String title){
        return titleService.findAll(id, title);
    }
}
