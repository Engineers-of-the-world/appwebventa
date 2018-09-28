/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.modell;

/**
 *
 * @author P&D
 */
public class Venta {
    private int id_venta,id_cliente_direccion,id_vendedor;
    private String fecha,concepto;
    private double igv, total, sub_total;
    //contructor
    //metodos get y set

    public Venta() {
    }

    public Venta(int id_venta, int id_cliente_direccion, int id_vendedor, String fecha, String concepto, double igv, double total, double sub_total) {
        this.id_venta = id_venta;
        this.id_cliente_direccion = id_cliente_direccion;
        this.id_vendedor = id_vendedor;
        this.fecha = fecha;
        this.concepto = concepto;
        this.igv = igv;
        this.total = total;
        this.sub_total = sub_total;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente_direccion() {
        return id_cliente_direccion;
    }

    public void setId_cliente_direccion(int id_cliente_direccion) {
        this.id_cliente_direccion = id_cliente_direccion;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }
    
    
}
