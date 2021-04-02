package com.algamoney.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algamoney.api.model.Categoria;
import com.algamoney.api.repository.CategoriaRepository;

@RestController //Indica que este é um controlador
@RequestMapping("/categorias") //Indica o inicio da uri de acesso a este controlador
public class CategoriaResource {
	
	// Injeção da dependência para accesso ao BD
	
	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	//Anotação que indica o verbo e o método a ser chamado por este controller obs(/listar) a frente da anotação para aumentar a uri
	
	@GetMapping 
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}

}
