package com.example.demo.model;

import java.math.BigInteger;

public class Factura {
	
    private BigInteger nroFactura;
    private double monto;
    private Pedido pedido;

    public Factura() {}
    
    public Factura(double monto, Pedido pedido) {
        this.monto = monto;
        this.pedido = pedido;
    }

    public BigInteger getNroFactura() {
        return this.nroFactura;
    }

    public void setNroFactura(BigInteger nroFactura) {
        this.nroFactura = nroFactura;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
