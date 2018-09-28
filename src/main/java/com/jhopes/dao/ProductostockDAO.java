/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.modell.Productostock;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface ProductostockDAO {
    public int createProductostock(Productostock ps);
    //public List<Productostock> readProductostock();
    public boolean updateProductostock(Productostock ps);
    public boolean deleteProductostock(String id);
}
