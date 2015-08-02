package com.tecsup.jsfprimefaces.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "fechaBean")
@RequestScoped
public class FechaBean {

	private Date fecha;
	private String fechaMinima;
	private String fechaMaxima;
	
	public FechaBean(){
		fechaMinima = "2014-09-18";
		fechaMaxima = "2014-09-24";	
	}

    // Agregar métodos set y get
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFechaMinima() {
        return fechaMinima;
    }

    public void setFechaMinima(String fechaMinima) {
        this.fechaMinima = fechaMinima;
    }

    public String getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFechaMaxima(String fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }

}
