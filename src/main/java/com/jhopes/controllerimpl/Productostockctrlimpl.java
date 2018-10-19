/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.config.Conexionbd;
import com.jhopes.dao.ProductostockDAO;
import com.jhopes.modell.Producto;
import com.jhopes.modell.Productostock;
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
public class Productostockctrlimpl implements ProductostockDAO {
    Conexionbd cx;
    String sql;
    ResultSet rs;
    List<Productostock> listDatos=null;
    List<Productostock> listDatosProdVenta = null;

    public Productostockctrlimpl() {
        cx=Conexionbd.getInstance();//intancia
    }   
    
    @Override
    public int createProductostock(Productostock ps) {
     return 1;
    }
    @Override
    public List<Productostock> readProductoVenta(String cond) {
        listDatosProdVenta = new ArrayList<>(); 
        sql = "SELECT p.id_producto, p.codigo, p.nombre, p.descripcion, ps.id_producto_stock, ps.stock_update, alp.precio_venta\n"
                + "FROM producto p, almacen_lote_producto alp, producto_stock ps\n"
                + "WHERE  p.id_producto = alp.id_producto AND alp.id_producto = ps.id_producto AND alp.id_almacen = ps.id_almacen\n"
                + "AND alp.id_lote = ps.id_lote";
        rs = cx.executeQuery(sql);        
        try {
            while (rs.next()) {
                listDatosProdVenta.add(new Productostock(rs.getInt("id_producto"), rs.getString("codigo"), rs.getString("nombre"), rs.getString("descripcion"),rs.getInt("id_producto_stock") , rs.getDouble("stock_update"), rs.getDouble("precio_venta")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Productostockctrlimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatosProdVenta;
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
