package br.com.desafiolivrosvirtual.repository;

import br.com.desafiolivrosvirtual.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleRepository extends JpaRepository<Title, Long> {

}
