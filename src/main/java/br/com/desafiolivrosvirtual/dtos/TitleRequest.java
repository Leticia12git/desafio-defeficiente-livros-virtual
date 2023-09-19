package br.com.desafiolivrosvirtual.dtos;

import br.com.desafiolivrosvirtual.model.Author;
import br.com.desafiolivrosvirtual.model.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class TitleRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(unique = true)
    private String title;
    @NotBlank
    @Size(max = 500)
    private String resumo;
    @NotBlank
    private String sumarry;
    @NotNull
    @Size(min = 20)
    private BigDecimal price;
    @Size(min = 100)
    private int quantityPages;
    @NotBlank
    @Column(unique = true)
    private String Isbn;
    private LocalDate lancamento;

    @OneToOne
    private Category category;

    @OneToOne
    private Author author;




}
