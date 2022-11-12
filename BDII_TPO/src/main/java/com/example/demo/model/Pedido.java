package com.example.demo.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class Pedido {

	@Id
	//Se puede esto en mongo???
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger nroPedido;
    private Carrito carrito;
    private Date fecha;

    public Pedido() {}
    
    public Pedido(Carrito carrito, Date fecha) {
        this.carrito = carrito;
        this.fecha = fecha;
    }

    public BigInteger getNroPedido() {
        return this.nroPedido;
    }

    public void setNroPedido(BigInteger nroPedido) {
        this.nroPedido = nroPedido;
    }

    public Carrito getCarrito() {
        return this.carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void confirmarPedido() {
    	Factura factura = new Factura(carrito.getTotal(), this);
    }
}
