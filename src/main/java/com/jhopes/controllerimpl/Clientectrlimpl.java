/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.config.Conexionbd;
import com.jhopes.dao.ClienteDAO;
import com.jhopes.modell.Cliente;
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
public class Clientectrlimpl implements ClienteDAO {

    List<Cliente> listDatos = null;
    String sql;
    Conexionbd cx;

    public Clientectrlimpl() {
        cx=Conexionbd.getInstance();//intancia
    }
    
    @Override
    public int createCliente(Cliente cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> readCliente() {
        listDatos = new ArrayList<>();
        sql = "SELECT id_cliente, nombres_razon_social , telefono, correo, dni_ruc "
                + "    FROM public.cliente";
        ResultSet rs = cx.executeQuery(sql);
        try {
            while (rs.next()) { 
                listDatos.add(new Cliente(Integer.parseInt(rs.getString("id_cliente")), rs.getString("nombres_razon_social"), rs.getString("telefono"),rs.getString("correo"), rs.getString("dni_ruc")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientectrlimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateCliente(Cliente cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCliente(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
