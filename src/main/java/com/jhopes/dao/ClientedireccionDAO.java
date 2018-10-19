/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.dao;

import com.jhopes.modell.Clientedireccion;
import java.util.List;

/**
 *
 * @author P&D
 */
public interface ClientedireccionDAO {
    public int createClientedireccion(Clientedireccion cld);
    public List<Clientedireccion> readClientedireccion(String cond);
    public boolean updateClientedireccion(Clientedireccion cl);
    public boolean deleteClientedireccion(String id);
}
