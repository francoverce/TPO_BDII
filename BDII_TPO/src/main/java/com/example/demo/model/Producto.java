package com.example.demo.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("catalogoProductos")
public class Producto {
	
	@Id
    private BigInteger id;
    private double precio;
    private String descripcion;
    private List<String> imagenes;
    private List<Comentario> comentarios;
    private List<String> videos;
    private double impuesto;

    public Producto() {}
    
    public Producto(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    public Producto(BigInteger idProducto, double precio, String descripcion, List<String> imagen, List<Comentario> comentarios, List<String> videos, double impuesto) {
        this.id = idProducto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.imagenes = imagen;
        this.comentarios = comentarios;
        this.videos = videos;
        this.impuesto = impuesto;
    }


    public BigInteger getIdProducto() {
        return this.id;
    }

    public void setIdProducto(BigInteger idProducto) {
        this.id = idProducto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getImagen() {
        return this.imagenes;
    }

    public void setImagen(List<String> imagen) {
        this.imagenes = imagen;
    }

    public List<Comentario> getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<String> getVideos() {
        return this.videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public double getImpuesto() {
        return this.impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    public void agregarComentario(Comentario comentario) {
    	if (this.comentarios.isEmpty())
    		this.comentarios = new ArrayList<Comentario>(); //esto es necesario aca o se puede inicializar en el constructor???
    	this.comentarios.add(comentario);
    }
    
}
