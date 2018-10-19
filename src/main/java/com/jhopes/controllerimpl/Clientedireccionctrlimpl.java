/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.config.Conexionbd;
import com.jhopes.dao.ClientedireccionDAO;
import com.jhopes.modell.Cliente;
import com.jhopes.modell.Clientedireccion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P&D
 */
public class Clientedireccionctrlimpl implements ClientedireccionDAO{
    List<Clientedireccion> listDatos = null;
    String sql;
    Conexionbd cx;

    public Clientedireccionctrlimpl() {
        this.cx = Conexionbd.getInstance();
    }

    @Override
    public int createClientedireccion(Clientedireccion cld) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clientedireccion> readClientedireccion(String id) {
     listDatos = new ArrayList<>();
        sql = "SELECT id_cliente_direccion, direccion , id_cliente "
                + " FROM public.cliente_direccion "
                + " WHERE id_cliente="+id+" ";
        ResultSet rs = cx.executeQuery(sql);        
        try {
            while (rs.next()) {
                //System.out.println("holas= "+rs.getString("nombres_razon_social"));
                listDatos.add(new Clientedireccion(rs.getInt("id_cliente_direccion"), rs.getInt("id_cliente"), rs.getString("direccion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientedireccionctrlimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateClientedireccion(Clientedireccion cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteClientedireccion(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
