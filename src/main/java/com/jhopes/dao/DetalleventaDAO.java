/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.modell.Detalleventa;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface DetalleventaDAO {
    public int createDetalleventa(Detalleventa dv);
    public List<Detalleventa> readDetalleventa();
    public boolean updateDetalleventa(Detalleventa dv);
    public boolean deleteDetalleventa(String id);
}
