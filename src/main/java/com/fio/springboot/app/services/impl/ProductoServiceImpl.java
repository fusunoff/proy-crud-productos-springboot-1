package com.fio.springboot.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fio.springboot.app.models.Producto;
import com.fio.springboot.app.repository.ProductoRepository;
import com.fio.springboot.app.services.IProductoService;

@Service("productoService")
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public Producto IdProducto(Integer idProducto) {
		Producto producto = null;
		
		try {
			producto = productoRepository.findById(idProducto).get() ;
			
		} catch (Exception e) {
		}
		
		return producto;
	}

	@Override
	public Producto IdProducto(String idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto save(Producto entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto update(Producto entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto deleteById(String idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
