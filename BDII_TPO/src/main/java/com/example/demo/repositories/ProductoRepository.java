package com.example.demo.repositories;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, Integer> {

	@Query("{nombre: '?0'}")
	Producto findByName(String nombre);
	
	@Query("{}")
	List<Producto> findAll();
	
}
