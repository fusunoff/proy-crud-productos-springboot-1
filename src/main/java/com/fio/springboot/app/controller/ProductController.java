package com.fio.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fio.springboot.app.models.Producto;
import com.fio.springboot.app.services.IProductoService;

@RestController
public class ProductController {

	@Autowired
	private IProductoService ProductoService;
	
	@GetMapping(value = "/producto/{idProducto}")
	public ResponseEntity<Producto>findByProducto(@PathVariable String idProducto) {
		Producto producto = new Producto();
		
		producto = ProductoService.IdProducto(idProducto);
		
		return new ResponseEntity <Producto> (producto, HttpStatus.OK );
	}
}



