/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.config.Conexionbd;
import com.jhopes.dao.ProductoDAO;
import com.jhopes.modell.Producto;
import java.util.List;

/**
 *
 * @author P&D
 */
public class Productoctrlimpl implements ProductoDAO {

    List<Producto> listDatosProd = null;    
    String sql;
    Conexionbd cx;

    @Override
    public int createProducto(Producto pr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> readProducto() {
        return listDatosProd;
    }

    @Override
    public boolean updateProducto(Producto cl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteProducto(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
