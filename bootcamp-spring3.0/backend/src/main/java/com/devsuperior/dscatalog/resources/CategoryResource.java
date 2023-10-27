package com.devsuperior.dscatalog.resources;

import java.util.List;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dscatalog.entities.Category;

@RestController
@RequestMapping(value = "/categories") //dentro de categories teremos varios endpoints (CRUD)
public class CategoryResource {
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List <CategoryDTO>> findAll(){
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}

//service -> repository -> banco de dados -> trouxe os objs -> instanciou -> trouxe p ca e guardou na List
