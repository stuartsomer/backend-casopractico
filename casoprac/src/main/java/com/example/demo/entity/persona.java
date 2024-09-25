package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PERSONA")
public class persona implements Serializable{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int edad;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNOMBRE() {
		return nombre;
	}
	public void setNOMBRE(String NOMBRE) {
		nombre = NOMBRE;
	}
	public int getEDAD() {
		return edad;
	}
	public void setEDAD(int EDAD) {
		edad = EDAD;
	}
	 private static final long serialVersionUID = 1L;

    

}
