/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controllerimpl;

import com.jhopes.config.Conexionbd;
import com.jhopes.dao.VentaDAO;
import com.jhopes.modell.Venta;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author P&D
 */
public class Ventactrlimpl implements VentaDAO{
    Conexionbd cx;
    String sql;
    ResultSet rs;
    List<Venta> listDatos=null;
    
    public Ventactrlimpl() {
        cx=Conexionbd.getInstance();//intancia
    }

    @Override
    public int createVenta(Venta venta) {        
        sql = "INSERT INTO public.venta(fecha , concepto, igv, total, sub_total, id_cliente_direccion, id_vendedor) "
                + "VALUES('"+venta.getFecha()+"','"+venta.getConcepto()+"',"+venta.getIgv()+","+venta.getTotal()+","+venta.getSub_total()+","+venta.getId_cliente_direccion()+","+venta.getId_vendedor()+")";
        return cx.performKeys(sql);
    }

    @Override
    public List<Venta> readVenta() {
        
        return listDatos;
    }

    @Override
    public boolean updateVenta(Venta venta) {
        //fecha , concepto, igv, total, sub_total, id_cliente_direccion, id_vendedor
        sql = "UPDATE public.venta SET "
                + " fecha = '"+venta.getFecha()+"', concepto = '"+venta.getConcepto()+"', igv="+venta.getIgv()+", total="+venta.getTotal()+", sub_total="+venta.getSub_total()+", id_cliente_direccion="+venta.getId_cliente_direccion()+", id_vendedor="+venta.getId_vendedor()+" "
                + "WHERE id_venta = "+venta.getId_venta()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteVenta(String id) {
        sql = "DELETE FROM public.venta "
                + "WHERE id_venta = "+id+" ";
        return cx.executeInsertUpdate(sql);
    }  
    @Override
    public void close(){
    Conexionbd.deleteInstance();
    }
    @Override
    public void commit(){
    cx.commit();
    }
    @Override
    public void rollback(){
    cx.rollback();
    }
}
