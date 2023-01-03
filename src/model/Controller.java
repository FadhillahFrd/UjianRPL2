/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Controller {
    ArrayList<Model> ArrayData;
    DefaultTableModel tabelModel;
    
    public Controller(){
        ArrayData = new ArrayList<Model>();
    }
    
    public void InsertData(String nip, String nama, String jabatan, boolean jenkel){
        Model mhs = new Model(nip, nama, jabatan, jenkel);
        ArrayData.add(mhs);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"NIP", "NAMA", "JABATAN", "JENIS KELAMIN"};
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(Model n : ArrayData){
            String[] arrData = {n.getNip(), n.getNama(), n.getJabatan(), (n.isJenkel()) ? "Laki - Laki" : "Perempuan"};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData, kolom){
            public boolean isCellEdittable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tabelModel;        
    }
    
    public static void main(String[] args) {
    }
    
}