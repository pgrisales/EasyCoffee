/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.easycoffee;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 * 
 * @author Diego Lopez Avila <dlopezav at unal.edu.co>
 */
public class ImgTabla extends JTextArea implements TableCellRenderer{
    private static final long serialVersionUID = 1L;
    private int altura;

    /**
     *
     */
    public ImgTabla() {
        setLineWrap(true);
        setWrapStyleWord(true);
        setOpaque(true);
    }
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o,
            boolean bln, boolean bln1,int i, int i1){
        
        setText(o.toString());//or something in value, like value.getNote()..
        if (bln) {
            setForeground(jtable.getSelectionForeground());
            setBackground(jtable.getSelectionBackground());
        } else {
            setForeground(jtable.getForeground());
            setBackground(jtable.getBackground());
        }
        setSize(jtable.getColumnModel().getColumn(i1).getWidth(),
            getPreferredSize().height);
        if (jtable.getRowHeight(i) != getPreferredSize().height) {
            if(o instanceof JLabel){
                JLabel lbl = (JLabel)o;
                altura = ((JLabel)o).getIcon().getIconHeight();
                jtable.setRowHeight(i, ((JLabel)o).getIcon().getIconHeight());
                
                return lbl;
            }else{
                if(altura <getPreferredSize().height){
                    jtable.setRowHeight(i, getPreferredSize().height);
                }
            }
            
           
        }
        
        return this;
    }
}
