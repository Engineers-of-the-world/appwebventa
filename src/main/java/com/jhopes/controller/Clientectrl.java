/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhopes.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author P&D
 */
@ViewScoped
@ManagedBean
public class Clientectrl implements Serializable{
    private static final long serialVersionUID = 1L;
 
  private static final String[] bands = {"Arch Enemy","Blind Guardian","Children of Bodom","Dimmu Borgir","Edge of Sanity",
    "Fields of the Nephilim", "Gates of Ishtar", "Holy Moses", "Iced Earth", "Jethro Tull",
    "Kreator", "Lamb of God", "Mekong Delta", "Night in Gales", "Old Dead Tree", "Persefone",
    "Running Wild", "Skyclad", "The Dillinger Escape Plan", "Theater of Tragedy", "Unleashed", "Vanden Plas", "Within Temptation", "Xystus", "Yes",
    "Zenobia",
  };
  public String getBandsCSV() {
    StringBuilder b=new StringBuilder();
    for (String s:bands) {
      if (b.length()>0) {
        b.append(",");
      }
      b.append(s);
    }
    return b.toString();
  }
  public String[] getBands() {
    return bands;
  }
 
  public List<String> getBandsList() {
    return Arrays.asList(bands);
  }
}
