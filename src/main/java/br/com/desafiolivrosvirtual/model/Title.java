package br.com.desafiolivrosvirtual.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "title")
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String sumarry;
    private BigDecimal price;
    private int quantityPages;
    private String Isbn;
    private LocalDate lancamento;

    @OneToOne
    private Category category;

    @OneToOne
    private Author author;




}
