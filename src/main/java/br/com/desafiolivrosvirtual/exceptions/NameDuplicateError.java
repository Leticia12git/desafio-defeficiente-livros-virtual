package br.com.desafiolivrosvirtual.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class NameDuplicateError extends Exception {
}
