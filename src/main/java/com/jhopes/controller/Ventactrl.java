/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import com.jhopes.controllerimpl.Detalleventactrlimpl;
import com.jhopes.controllerimpl.Productostockctrlimpl;
import com.jhopes.controllerimpl.Ventactrlimpl;
import com.jhopes.dao.DetalleventaDAO;
import com.jhopes.dao.ProductostockDAO;
import com.jhopes.dao.VentaDAO;
import com.jhopes.modell.Detalleventa;
import com.jhopes.modell.Productostock;
import com.jhopes.modell.Venta;

/**
 *
 * @author P&D
 */
public class Ventactrl {
    private VentaDAO vdao;
    private ProductostockDAO psdao;
    private DetalleventaDAO dvdao;
    private Venta v;
    private Detalleventa dv;
    private Productostock ps;
    private int id_venta,id_detalle_venta;
    public Ventactrl() {
        vdao = new Ventactrlimpl();
        psdao = new Productostockctrlimpl();
        dvdao = new Detalleventactrlimpl();
    }
    
    public void createVenta(){
        
        id_venta = vdao.createVenta(v);
        if(id_venta!=0){
            dv.setId_venta(id_venta);
            id_detalle_venta = dvdao.createDetalleventa(dv);
            if(id_detalle_venta!=0){
                ps.setId_producto_stock(dv.getId_producto_stock());
                ps.setStock_update(dv.getCantidad());
                if(psdao.updateProductostock(ps)){
                    vdao.commit();
                }else{
                    vdao.rollback();
                }
            }else{
                vdao.rollback();
                System.out.println("Error al insertar el detalle de venta");
            }
        }else{
            System.out.println("Error al insertar la venta");
        }
    }

    public Venta getV() {
        return v;
    }

    public void setV(Venta v) {
        this.v = v;
    }

    public Detalleventa getDv() {
        return dv;
    }

    public void setDv(Detalleventa dv) {
        this.dv = dv;
    }
    
}
