/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes1;

import java.util.Map;

/**
 *
 * @author arrai
 */
public class Peminjam {
    private Map<String, Book> daftarBuku;
    private String Name;
    private String Addres;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String Addres) {
        this.Addres = Addres;
    }
    
    
}
