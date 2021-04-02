package com.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algamoney.api.model.Categoria;

/*
 * Interface que implementa os objetos para manipulação do banco de dados;
 * Os parâmetros <Categoria, Long> indicam o tipo de objeto e o tipo do indentificador do objeto
 * neste caso o Código que é do tipo Long
 * */

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
