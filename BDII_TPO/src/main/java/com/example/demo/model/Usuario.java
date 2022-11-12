package com.example.demo.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Usuario {

	@Id
    private BigInteger id;
    private String nombre;
    private String contrasenia;
    private boolean estado;
    private String direccion;
    //Averiguar condiciones de usuario ante el IVA
    //enum???
    //float/double???
    private boolean condicionIVA;
    
    //private boolean operador???
    //se chequea que sea operador antes de modificar un producto (no seria necesaria la clase operador)
    //se agregan aca los metodos abm de productos

    public void iniciarSesion() {
    	this.setEstado(true);
    }

    public void cerrarSesion(){
    	this.setEstado(false);
    }
    
    public Usuario(String nombre, boolean condicionIVA) {
        this.nombre = nombre;
        this.condicionIVA = condicionIVA;
    }

    public Usuario(BigInteger id, String nombre, String contrasenia, boolean estado, String direccion, boolean condicionIVA) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.estado = estado;
        this.direccion = direccion;
        this.condicionIVA = condicionIVA;
    }


    public BigInteger getIdUsuario() {
        return this.id;
    }

    public void setIdUsuario(BigInteger id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isCondicionIVA() {
        return this.condicionIVA;
    }

    public boolean getCondicionIVA() {
        return this.condicionIVA;
    }

    public void setCondicionIVA(boolean condicionIVA) {
        this.condicionIVA = condicionIVA;
    }
    
    public void comentar(Producto producto, String titulo, String contenido) {
    	Date actual = new Date();
    	Comentario comentario = new Comentario(titulo, contenido, actual, this);
    	producto.agregarComentario(comentario);
    	//this.comentarios.add(comentario)???
    }
    
}
