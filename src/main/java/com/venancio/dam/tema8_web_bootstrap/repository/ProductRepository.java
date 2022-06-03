package com.venancio.dam.tema8_web_bootstrap.repository;

import java.util.List;

import com.venancio.dam.tema8_web_bootstrap.dao.ProductDAO;
import com.venancio.dam.tema8_web_bootstrap.model.Producto;

public class ProductRepository {

	private ProductDAO dao;
	
    // Singleton
    private static ProductRepository instance;
	
    /**
    * Return a singleton instance
    */
    public static synchronized ProductRepository getInstance() {
        if (instance == null) {
            instance = new ProductRepository();
        }
        return instance;
    }
	
    private ProductRepository() {
    	dao = new ProductDAO();
    }
    
    public List<Producto> findAll(){ 
    	return dao.getProducts(); 
    }
    public Producto findById(String id){ 
    	List<Producto> prods = dao.getProducts();
    	Producto p = null;
    	for (Producto elem : prods) {
    		if(elem.getIdProducto()== id)
    			p = elem;
		}
    	
    	return p; 
    }
    
    public void insert(Producto prod) {
    	dao.setProduct(prod);
    }
}
