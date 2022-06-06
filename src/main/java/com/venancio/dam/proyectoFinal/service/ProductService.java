package com.venancio.dam.proyectoFinal.service;

import java.util.List;

import com.venancio.dam.proyectoFinal.model.Producto;
import com.venancio.dam.proyectoFinal.repository.ProductRepository;

public class ProductService {
	
	public List<Producto> findAll() {
        return ProductRepository.getInstance().findAll();
    }

    public Producto findById(String id) {
        return ProductRepository.getInstance().findById(id);
    }
    
    public void insert(Producto prod) {
        ProductRepository.getInstance().insert(prod);
    }

}
