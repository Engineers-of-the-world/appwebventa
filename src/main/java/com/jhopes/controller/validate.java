/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author P&D
 */
@Named(value = "validate")
@Dependent
public class validate {

    /**
     * Creates a new instance of validate
     */
    public validate() {
    }
    public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
         throws ValidatorException {
      if (((String)arg2).length()<5) {
         throw new ValidatorException(new FacesMessage("Al menos 5 caracteres "));
      }
   }
}
