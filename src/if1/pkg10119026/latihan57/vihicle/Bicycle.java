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
public class Bicycle extends Vihicle{
    private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount = gearCount;
    }
}
