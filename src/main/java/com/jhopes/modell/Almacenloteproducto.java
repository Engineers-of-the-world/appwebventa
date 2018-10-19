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
public class Almacenloteproducto extends Producto {
    int id_lote,id_almacen, id_unimed;
    double stock_fijo, costo, precio_venta ;

    public Almacenloteproducto() {
    }

    public Almacenloteproducto(int id_producto,int id_lote, int id_almacen, int id_unimed, double stock_fijo, double costo, double precio_venta) {
        this.id_producto = id_producto;
        this.id_lote = id_lote;
        this.id_almacen = id_almacen;
        this.id_unimed = id_unimed;
        this.stock_fijo = stock_fijo;
        this.costo = costo;
        this.precio_venta = precio_venta;
    }

    public Almacenloteproducto(int id_producto, int id_categoria, String nombre, String descripcion, String codigo) {
        super(id_producto, id_categoria, nombre, descripcion, codigo);
    }   
    

    public int getId_lote() {
        return id_lote;
    }

    public void setId_lote(int id_lote) {
        this.id_lote = id_lote;
    }

    public int getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(int id_almacen) {
        this.id_almacen = id_almacen;
    }

    public int getId_unimed() {
        return id_unimed;
    }

    public void setId_unimed(int id_unimed) {
        this.id_unimed = id_unimed;
    }

    public double getStock_fijo() {
        return stock_fijo;
    }

    public void setStock_fijo(double stock_fijo) {
        this.stock_fijo = stock_fijo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    
}
