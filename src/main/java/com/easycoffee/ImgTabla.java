/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.easycoffee;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class ImgTabla extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o,
            boolean bln, boolean bln1,int i, int i1){
        if(o instanceof JLabel){
            JLabel lbl = (JLabel)o;
            return lbl;
        }
        
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
    }
}
