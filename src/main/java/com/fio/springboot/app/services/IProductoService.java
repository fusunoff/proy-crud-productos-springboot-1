package com.fio.springboot.app.services;

import java.util.List;

import com.fio.springboot.app.models.Producto;

public interface IProductoService {

	public abstract Producto IdProducto(Integer idProducto);
	
	public abstract Producto IdProducto(String idProducto);
	
	public abstract Producto save(Producto entity);
	
	public abstract List <Producto> findAll();
	
	public abstract Producto update(Producto entity);
	
	public abstract Producto deleteById(String idProducto);
	
}
