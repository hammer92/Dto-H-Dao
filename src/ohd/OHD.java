/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohd;

import Blog.Dao.FincaDAO;
import Blog.Dto.FincaDTO;

/**
 *
 * @author hammer
 */
public class OHD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FincaDAO fin = new FincaDAO();
        
        fin.create(new FincaDTO("1234", "las flores", "diireccion", "telefono", "email", true));
    }
    
}
