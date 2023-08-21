package br.com.desafiolivrosvirtual.repository;

import br.com.desafiolivrosvirtual.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository <Author, Long> {
}
