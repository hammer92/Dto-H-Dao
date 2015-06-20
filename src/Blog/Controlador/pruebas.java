/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog.Controlador;

import Blog.Conexion.Conexion;
import Blog.Dao.DAO;
import Blog.Dao.UsuarioDao;
import Blog.Dto.CategoriaDTO;
import Blog.Dto.UsuarioDto;
import java.io.File;

/**
 *
 * @author hammer
 */
public class pruebas {
    public static void main(String[] args) {
//        DAO c = new DAO();
//        String SQL ="INSERT INTO usuario ( usuario,contraseña,email,fechacreacion ) VALUES ( ?,?,?,? )";
//        String[] SQLdato ={"HAMMER","123","HAMMMER PINTO","0000-00-00"} ;
//        c.ommit(SQL, SQLdato);
        //c.update(new CategoriaDTO(2, "info"));
        UsuarioDao us = new UsuarioDao();
        //UsuarioDto c = new UsuarioDto(1, "", "", "", "");
        //c.readall();
        System.out.println(us.create(new UsuarioDto(0, "jorge", "aron", "email2", "2015-01-01")));
        System.out.println(us.create(new UsuarioDto(0, "marcela", "escobar", "email2", "2015-01-01")));
        System.out.println(us.create(new UsuarioDto(0, "maira", "porras", "email2", "2015-01-01")));
        System.out.println(us.create(new UsuarioDto(0, "elias", "garcia", "email2", "2015-01-01")));
        //System.out.println(us.delete(new UsuarioDto(4))); 
        //System.out.println(c.sqlInsert());
       // File fichero = new File("test.sql");
        //System.out.println(fichero.getAbsoluteFile());
       // Conexion con = Conexion.saberEstado("mysql","localhost","3306","hola", "root", "root");
        
    }
}
