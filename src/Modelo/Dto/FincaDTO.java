/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dto;

import Modelo.DTO;

/**
 *
 * @author hammer
 */
public class FincaDTO extends DTO{
    private int id;
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private boolean registrofedepalma;

    public FincaDTO(String nit, String nombre, String direccion, String telefono, String email, boolean registrofedepalma) {
        getTabla("finca");
        this.nit = nit; getColumnaString("nit");
        this.nombre = nombre;getColumnaString("nombre");
        this.direccion = direccion;getColumnaString("direccion");
        this.telefono = telefono;getColumnaString("telefono");
        this.email = email;getColumnaString("email");
        this.registrofedepalma = registrofedepalma;getColumnaString("registofedepalma");
    }

    public FincaDTO(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int isRegistrofedepalma() {
        if(registrofedepalma){
            return 1;
        }
        return 0;
    }

    public void setRegistrofedepalma(boolean registrofedepalma) {
        this.registrofedepalma = registrofedepalma;
    }
    
    
}
