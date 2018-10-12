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
public class Clientedireccion {
    private int id_cliente_direccion, id_cliente; 
    private String direccion;

    public Clientedireccion() {
    }

    public Clientedireccion(int id_cliente_direccion, int id_cliente, String direccion) {
        this.id_cliente_direccion = id_cliente_direccion;
        this.id_cliente = id_cliente;
        this.direccion = direccion;
    }

    public int getId_cliente_direccion() {
        return id_cliente_direccion;
    }

    public void setId_cliente_direccion(int id_cliente_direccion) {
        this.id_cliente_direccion = id_cliente_direccion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
       
    
}
