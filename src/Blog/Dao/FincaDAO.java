/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog.Dao;

import Blog.Dto.FincaDTO;
import Blog.Interfaces.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hammer
 */
public class FincaDAO implements Obligacion<FincaDTO>{
    private DAO dao = new DAO();
    @Override
    public boolean create(FincaDTO c) {
        String boole= Integer.toString(c.isRegistrofedepalma());
        String[] param = {c.getNit(),c.getNombre(),c.getDireccion(),c.getTelefono(),c.getEmail(),boole};
       return dao.executeUpdate(c.sqlInsert(), param);       
        
    }

    @Override
    public boolean delete(FincaDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(FincaDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FincaDTO read(FincaDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FincaDTO> readall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet fincajoinlinea() throws SQLException{
        String sql="";
        ResultSet res =dao.executeQuery(sql, null);
                  
            return res;
        
    }
}
