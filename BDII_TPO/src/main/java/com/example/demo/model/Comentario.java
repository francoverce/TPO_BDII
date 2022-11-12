package com.example.demo.model;

import java.util.Date;

public class Comentario {
	
	private String titulo;
    private String contenido;
    private Date fecha;
    private Usuario usuario;

    public Comentario() {}
    
    public Comentario(String titulo, String contenido, Date fecha, Usuario usuario) {
    	this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
