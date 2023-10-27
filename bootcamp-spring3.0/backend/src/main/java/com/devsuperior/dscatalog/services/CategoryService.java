package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service //Registrar a classe CategoryService como um componente que vai participar do sistema
//de injeção de dependencia do spring
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();

        return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
        //para cada elemento x da list original vamos transformar ele ou levar ele para um outro elemento
        //esse elemento vai ser o new CategoryDTO(x)
        //portando estamos pegando cada elemento da nossa lista original e estamos aplicando para cada elemento
        //uma funcao lambda, que estamos transformando o elemento X que era do tipo category em um novo
        //categoryDTO recebendo X
    }

}


