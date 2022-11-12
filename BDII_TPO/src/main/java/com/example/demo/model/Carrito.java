package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrito {
	
    private Usuario usuario;
    private List<Producto> productos;
    private double total;
    
    private List<Carrito> estados;

	public Carrito() {}

    /*
    public Carrito(Usuario usuario, List<Producto> productos, double total) {
        this.usuario = usuario;
        this.productos = productos;
        this.total = total;
    }
    */

    public Usuario getUsuario() { return this.usuario; }

    public List<Producto> getProductos() { return this.productos; }

    public double getTotal() { return this.total;  }
    
    public List<Carrito> getEstados() {
		return estados;
	}
    
    public void abrirCarrito(Usuario usuario) {
    	this.usuario = usuario;
    	this.productos = new ArrayList<Producto>();
    	
    	this.estados = new ArrayList<Carrito>();
    }
    
    public void agregarProducto(Producto producto, int cantidad) {
    	for (int i = 0; i < cantidad; i++)
    		this.productos.add(producto);
    	
    	this.estados.add(this);
    }
    
    public void eliminarProducto(Producto producto) {
    	if (!this.productos.contains(producto))
    		System.out.println("El producto no está en el carrito");
    	else {
    		this.productos.remove(producto);
    		
    		this.estados.add(this);
    	}
    }
    
    public void recuperarEstadoAnterior() {
    	this.productos = this.estados.get(this.estados.size() - 1).productos;
    	this.estados.remove(this.estados.size());
    }
    
    //Asi se manejan los impuestos???
    public void confirmarCarrito() {
    	double subtotal = 0;
    	for (Producto p : productos)
    		//tot += p.getPrecio() * p.getImpuesto();
    		subtotal += p.getPrecio();
    	//subtotal
    	if (this.usuario.isCondicionIVA())
    		//El IVA se hardcodea aca??? Mejor poner atributo IVA en el Usuario como float/double???
    		subtotal *= 1.21;
    	this.total = subtotal;
    	this.productos.clear();
    	//this.generarPedido()???
    }
    
    public void generarPedido() {
    	Date actual = new Date();
    	Pedido pedido = new Pedido(this, actual);
    	//no se hace nada con el pedido :/
    	//aca habria que hacer un usuario.add(pedido);
    }
}
