/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import com.jhopes.controllerimpl.Clientectrlimpl;
import com.jhopes.controllerimpl.Clientedireccionctrlimpl;
import com.jhopes.dao.ClienteDAO;
import com.jhopes.dao.ClientedireccionDAO;
import com.jhopes.modell.Cliente;
import com.jhopes.modell.Clientedireccion;
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
public class Clientectrl implements Serializable {

    private static final long serialVersionUID = 1L;
    private Cliente selectedcli;
    private Clientedireccion selectedclidir;
    private ClientedireccionDAO clidirdao;
    private ClienteDAO clidao;
    private List<Cliente> list = new ArrayList<>();
    private List<Clientedireccion> listclidir = new ArrayList<>();
    
    public Clientectrl() {
        this.selectedcli = new Cliente();
        this.selectedclidir = new Clientedireccion();
    }
    
    public void searchRuc(List<Cliente> list, String ruc) {        
        for (Cliente list1 : list) {
           if(list1.getDni_ruc().equals(ruc)){               
               this.selectedcli =new Cliente(list1.getId_cliente(),list1.getNombres_razon_social(),list1.getTelefono(), list1.getCorreo(),list1.getDni_ruc());
            }
        }
        searchclientedir();
    }
    public void searchclientedir(){ 
        listclidir = new ArrayList<>();
        for (Clientedireccion listclidir : listaclidir(selectedcli.getId_cliente()+"")){
            this.selectedclidir =new Clientedireccion(listclidir.getId_cliente_direccion(), listclidir.getId_cliente(), listclidir.getDireccion());
            this.listclidir.add(selectedclidir);
        }
    }

    public void setList(List<Cliente> list) {
        this.list = list;
    }

    public List<Cliente> getList() {
        clidao = new Clientectrlimpl();
        return clidao.readCliente();
    }

    public Cliente getSelectedcli() {
        return selectedcli;
    }

    public void setSelectedcli(Cliente selectedcli) {
        this.selectedcli = selectedcli;
    }

    public Clientedireccion getSelectedclidir() {
        return selectedclidir;
    }

    public void setSelectedclidir(Clientedireccion selectedclidir) {
        this.selectedclidir = selectedclidir;
    }

    public ClientedireccionDAO getClidirdao() {
        return clidirdao;
    }

    public void setClidirdao(ClientedireccionDAO clidirdao) {
        this.clidirdao = clidirdao;
    }

    public List<Clientedireccion> listaclidir(String id){
            clidirdao = new Clientedireccionctrlimpl();
        return clidirdao.readClientedireccion(id);
    }

    public List<Clientedireccion> getListclidir() {
        return listclidir;
    }

    public void setListclidir(List<Clientedireccion> listclidir) {
        this.listclidir = listclidir;
    }

    

}
