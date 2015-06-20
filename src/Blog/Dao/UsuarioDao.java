/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog.Dao;

import Blog.Dto.UsuarioDto;
import Blog.Interfaces.Obligacion;
import java.util.List;

/**
 *
 * @author hammer
 */
public class UsuarioDao implements Obligacion<UsuarioDto> {
    private final DAO dao = new DAO(); 
    
    @Override
    public boolean create(UsuarioDto c) {
        String[] param={c.getUsuario(),c.getContraseña(),c.getEmail(),c.getFechacreacion()};
        return dao.executeUpdate(c.sqlInsert(), param);
        
    }

    @Override
    public boolean delete(UsuarioDto c) {  
        String[] param={Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
        
    }

    @Override
    public boolean update(UsuarioDto c) {
        String[] param={c.getUsuario(),c.getContraseña(),c.getEmail(),c.getFechacreacion(),Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlUpdate(), param);
        
    }

    @Override
    public UsuarioDto read(UsuarioDto c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UsuarioDto> readall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
