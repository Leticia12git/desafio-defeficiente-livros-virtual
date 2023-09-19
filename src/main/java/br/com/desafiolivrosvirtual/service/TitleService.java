package br.com.desafiolivrosvirtual.service;

import br.com.desafiolivrosvirtual.dtos.TitleRequest;
import br.com.desafiolivrosvirtual.model.Title;
import br.com.desafiolivrosvirtual.repository.TitleRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleService {

    @Autowired
    private TitleRepository titleRepository;

    public Title create(Title title){
        Title newTitle = new Title();
        title.getTitle();
        title.getSumarry();
        title.getPrice();
        title.getQuantityPages();
        title.getIsbn();
        title.getLancamento();
        return titleRepository.save(title);
    }

    public List<Title> findAll(Long id, String title){
        return titleRepository.findAll();
    }
}
