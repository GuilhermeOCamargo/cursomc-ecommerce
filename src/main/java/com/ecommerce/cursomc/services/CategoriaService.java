package com.ecommerce.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.cursomc.domain.Categoria;
import com.ecommerce.cursomc.repositories.CategoriaRepository;
import com.ecommerce.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> categoria =  categoriaRepository.findById(id);
		return categoria.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: "+ id+
				", Tipo: "+ Categoria.class.getName()));
	}
}
