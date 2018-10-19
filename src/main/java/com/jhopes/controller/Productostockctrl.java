/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import com.jhopes.controllerimpl.Productostockctrlimpl;
import com.jhopes.dao.ProductostockDAO;
import com.jhopes.modell.Productostock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author P&D
 */
@ViewScoped
@ManagedBean
public class Productostockctrl implements Serializable {
    private List<Productostock> listprostock = new ArrayList<>();
    private Productostock selected=null;
    private ProductostockDAO prostockdao= null;

    public Productostockctrl() {
        selected = new Productostock();
    }
    
    public void searchprodstock(List<Productostock> list, String cadena){        
        String id_productostock = cadena.substring(cadena.indexOf("(id:")+4,cadena.indexOf(")"));
        for (Productostock list1 : list) {
           if(list1.getId_producto_stock()== Integer.parseInt(id_productostock)){               
               this.selected =new Productostock(list1.getId_producto(),list1.getCodigo(),list1.getNombre(), list1.getDescripcion(),list1.getId_producto_stock(),list1.getStock_update(),list1.getPrecio_venta());
            }
        }
    }

    public List<Productostock> getListprostock() {
        prostockdao = new Productostockctrlimpl();
        return prostockdao.readProductoVenta("Condicion");
    }

    public void setListprostock(List<Productostock> listprostock) {
        this.listprostock = listprostock;
    }
    public Productostock getSelected() {
        return selected;
    }

    public void setSelected(Productostock selected) {
        this.selected = selected;
    }
    
}
