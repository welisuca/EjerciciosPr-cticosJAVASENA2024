/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciojava1;

/**
 *
 * @author ASUS
 */
public class Persona {
    private String nombre,apellido;
    private int edad, telefono;
    
    public Persona (String nombre,String apellido,int edad,int telefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void mostrarDatosPersona(Persona P){
        System.out.println("Nombre: "+P.nombre+"\nApellido: "+P.apellido);
        System.out.println("Edad: "+P.edad+"\nTelefono: "+P.telefono);
    }
}
