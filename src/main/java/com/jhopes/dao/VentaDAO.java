/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.modell.Venta;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface VentaDAO {
    public int createVenta(Venta venta);
    public List<Venta> readVenta();
    public boolean updateVenta(Venta venta);
    public boolean deleteVenta(String id);
    public void commit();
    public void rollback();
    public void close();
}
