package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.model.Carrito;
import com.example.demo.model.Producto;
import com.example.demo.model.Usuario;
import com.example.demo.repositories.ProductoRepository;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class BdiiTpoApplication {
	
	@Autowired
	ProductoRepository productoRepository;

	public static void main(String[] args) {
		SpringApplication.run(BdiiTpoApplication.class, args);
		/*
		Producto p = new Producto(20, "prodA");
		Usuario u = new Usuario("usuarioA", true);
		Carrito c = new Carrito();
		c.abrirCarrito(u);
		
		c.agregarProducto(p, 1);
		c.agregarProducto(p, 1);
		c.agregarProducto(p, 3);
		
		for (Carrito cinx : c.getEstados()) {
			System.out.println("Estado:");
			for (Producto pinx : cinx.getProductos())
				System.out.println(pinx.getPrecio());
		}
		
		//c.recuperarEstadoAnterior();
		
		c.confirmarCarrito();
		System.out.println(c.getTotal());
		*/
	}

}
