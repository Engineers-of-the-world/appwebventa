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
public class Productostock extends Almacenloteproducto {
    private int id_producto_stock;
    private double stock_update;
    //contructor
    //metodos get y set

    public Productostock() {
    }

    public Productostock(int id_producto_stock, int id_producto, int id_lote, int id_almacen, double stock_update) {
        this.id_producto_stock = id_producto_stock;
        this.id_producto = id_producto;
        this.id_lote = id_lote;
        this.id_almacen = id_almacen;
        this.stock_update = stock_update;
    }
    //p.id_producto, p.codigo, p.nombre, p.descripcion,ps.id_producto_stock, ps.stock_update, alp.precio_venta

    public Productostock(int id_producto, String codigo, String nombre, String descripcion,int id_producto_stock,double stock_update, double precio_venta) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.id_producto_stock = id_producto_stock;
        this.stock_update = stock_update;
        this.precio_venta = precio_venta;
    }

    
    
    public int getId_producto_stock() {
        return id_producto_stock;
    }

    public void setId_producto_stock(int id_producto_stock) {
        this.id_producto_stock = id_producto_stock;
    }

    public double getStock_update() {
        return stock_update;
    }

    public void setStock_update(double stock_update) {
        this.stock_update = stock_update;
    }
    public String toString(){
        return this.descripcion+"(id:"+this.id_producto_stock+")";
    }
    
}
