package com.example.demo.entity;

public class mensajes {
	private String mensaje;


    public mensajes(String mensaje, int edad, String nombre) {
        this.mensaje = mensaje + " El registro de " + nombre + ", próximamente tendrás " + edad;
  
    }

    // Getters y Setters
    public String getMessage() {
        return this.mensaje;
    }

    public void setMessage(String mensaje) {
        this.mensaje = mensaje;
    }

    
}
