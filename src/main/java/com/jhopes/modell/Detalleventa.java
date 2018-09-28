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
public class Detalleventa {
    private int id_detalle_venta,id_venta, item, id_producto_stock;
    private double igv , sub_total, descuento, cantidad,precio_unit;
    //contructor
    //metodos get y set

    public Detalleventa() {
    }

    public Detalleventa(int id_detalle_venta, int id_venta, int item, int id_producto_stock, double igv, double sub_total, double descuento, double cantidad, double precio_unit) {
        this.id_detalle_venta = id_detalle_venta;
        this.id_venta = id_venta;
        this.item = item;
        this.id_producto_stock = id_producto_stock;
        this.igv = igv;
        this.sub_total = sub_total;
        this.descuento = descuento;
        this.cantidad = cantidad;
        this.precio_unit = precio_unit;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getId_producto_stock() {
        return id_producto_stock;
    }

    public void setId_producto_stock(int id_producto_stock) {
        this.id_producto_stock = id_producto_stock;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(double precio_unit) {
        this.precio_unit = precio_unit;
    }
    
}
