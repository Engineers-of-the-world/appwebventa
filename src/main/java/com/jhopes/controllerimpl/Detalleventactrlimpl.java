/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.config.Conexionbd;
import com.jhopes.dao.DetalleventaDAO;
import com.jhopes.modell.Detalleventa;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author P&D
 */
public class Detalleventactrlimpl implements DetalleventaDAO{
    Conexionbd cx;
    String sql;
    ResultSet rs;
    List<Detalleventa> listDatos=null;
    public Detalleventactrlimpl() {
        cx=Conexionbd.getInstance();//intancia
    }

    
    @Override
    public int createDetalleventa(Detalleventa dv) {
        /*id_detalle_venta , id_venta, item, igv, sub_total, descuento, id_producto_stock, cantidad, precio_unit,*/
    sql = "INSERT INTO public.detalle_venta(id_venta, item, igv, sub_total, descuento, id_producto_stock, cantidad, precio_unit) "
                + "VALUES("+dv.getId_venta()+","+dv.getItem()+","+dv.getIgv()+","+dv.getSub_total()+","+dv.getDescuento()+","+dv.getId_producto_stock()+","+dv.getCantidad()+", "+dv.getPrecio_unit()+")";
        return cx.performKeys(sql);
    }

    @Override
    public List<Detalleventa> readDetalleventa() {
        
        return null;
    }

    @Override
    public boolean updateDetalleventa(Detalleventa dv) {
     sql = "UPDATE public.detalle_venta SET "
                + " id_venta="+dv.getId_venta()+", item="+dv.getItem()+", igv="+dv.getIgv()+", sub_total="+dv.getSub_total()+", descuento="+dv.getDescuento()+", id_producto_stock="+dv.getId_producto_stock()+", cantidad="+dv.getCantidad()+", precio_unit="+dv.getPrecio_unit()+" "
                + "WHERE id_detalle_venta = "+dv.getId_detalle_venta()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteDetalleventa(String id) {
    sql = "DELETE FROM public.detalle_venta "
                + "WHERE id_detalle_venta = "+id+" ";
        return cx.executeInsertUpdate(sql);
    }
    
}
