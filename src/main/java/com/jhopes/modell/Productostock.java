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
public class Productostock {
    private int id_producto_stock ,id_producto, id_lote, id_almacen;
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

    public int getId_producto_stock() {
        return id_producto_stock;
    }

    public void setId_producto_stock(int id_producto_stock) {
        this.id_producto_stock = id_producto_stock;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
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

    public double getStock_update() {
        return stock_update;
    }

    public void setStock_update(double stock_update) {
        this.stock_update = stock_update;
    }
    
}
