/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan57.vihicle;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menampilkan jenis vihicle
 */
public class Vihicle {
    private String myBrand;
    private String myModel;
    
    public Vihicle(){
        
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setMyBrand(String brand){
        this.myBrand = brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        this.myModel= model;
    }
    
}
