/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.config.Conexionbd;
import com.jhopes.dao.ProductostockDAO;
import com.jhopes.modell.Productostock;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author P&D
 */
public class Productostockctrlimpl implements ProductostockDAO {
    Conexionbd cx;
    String sql;
    ResultSet rs;
    List<Productostock> listDatos=null;

    public Productostockctrlimpl() {
        cx=Conexionbd.getInstance();//intancia
    }   
    
    @Override
    public int createProductostock(Productostock ps) {
     return 1;
    }

    @Override
    public boolean updateProductostock(Productostock ps) {
    sql = "UPDATE public.producto_stock SET "
                + " stock_update = stock_update-"+ps.getStock_update()+""
                + "WHERE id_producto_stock = "+ps.getId_producto_stock()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteProductostock(String id) {
     return true;
    }
    
}
