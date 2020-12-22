package com.fio.springboot.app.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fio.springboot.app.models.Producto;

@Repository("ProductoRepository")
public interface ProductoRepository extends MongoRepository<Producto, Serializable> {
	
 Producto findById(String id);
 
 Producto deleteById(String id);
 
	

}
