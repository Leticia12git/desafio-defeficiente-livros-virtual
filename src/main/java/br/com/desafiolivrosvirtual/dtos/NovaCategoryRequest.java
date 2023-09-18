package br.com.desafiolivrosvirtual.dtos;

import br.com.desafiolivrosvirtual.model.Category;

public class NovaCategoryRequest {

    @UniqueValue(domainClass = Category.class, fieldName = "nome")
}
