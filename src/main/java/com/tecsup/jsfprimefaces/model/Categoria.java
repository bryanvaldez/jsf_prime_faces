/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprimefaces.model;
 
/**
 *
 * @author jose
 */
public class Categoria {
 
    private Long id;
 
    private String descripcion;
 
    public Categoria(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
 
    public Categoria() {
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
}
