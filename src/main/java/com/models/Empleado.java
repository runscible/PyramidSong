package com.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.google.gson.Gson;

@Entity
@Table(name="empleado", schema="public")
public class Empleado {
	@Column(name="id" , unique=true, nullable=false )
	private int id; 
	
	@Column(name="nombre", unique=false,  length= 50)
	private String nombre;
	
	@Column(name="sueldo", unique=false, length = 50)
	private double sueldo;
	
	@Column(name="Fecha_creacion", unique = false, length = 50)
	@Type(type="date")
	private Date Fecha_creacion; 
	
	
	/*
	public Empleado (String nombre , double sueldo){
		this.sueldo = sueldo;
		this.nombre = nombre; 
	}
	*/
	
	public Date getFecha_creacion() {
		return Fecha_creacion;
	}
	
	
	public void setFecha_creacion(Date Fecha_creacion) {
		this.Fecha_creacion = Fecha_creacion;
	}
	
	@Id
	public int getId() {
		return id;
	}
	
	public void setId(int id ){
		this.id =  id; 
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double d) {
		this.sueldo = d;
	}
	
}
