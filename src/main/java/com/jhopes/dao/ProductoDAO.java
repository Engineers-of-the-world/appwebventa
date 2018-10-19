/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.modell.Producto;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface ProductoDAO {
    public int createProducto(Producto pr);
    public List<Producto> readProducto();    
    public boolean updateProducto(Producto cl);
    public boolean deleteProducto(String id);
}
