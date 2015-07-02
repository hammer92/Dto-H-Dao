/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dto;

import Modelo.DAO;

/**
 *
 * @author hammer
 */
public class CategoriaDTO extends DAO{ 
    public static final String SQL_INSERT ="INSERT INTO categoria ( nombre ) VALUES ( ? )";
    private static final String SQL_DELETE ="DELETE FROM categoria WHERE id = ? ";
    private static final String SQL_UPDATE ="UPDATE categoria SET nombre = ? WHERE id = ? ";
    private static final String SQL_READ   ="SELECT * FROM categoria WHERE id = ? ";
    private static final String SQL_READALL="SELECT *FROM categoria";
    private int id;
    private String nombre;

    public CategoriaDTO() {
    }

    public CategoriaDTO(int id) {
        this.id = id;
    }

    public CategoriaDTO(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public CategoriaDTO(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}

