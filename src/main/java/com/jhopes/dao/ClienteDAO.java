/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.modell.Cliente;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface ClienteDAO {
    public int createCliente(Cliente cl);
    public List<Cliente> readCliente();
    public boolean updateCliente(Cliente cl);
    public boolean deleteCliente(String id);
}
