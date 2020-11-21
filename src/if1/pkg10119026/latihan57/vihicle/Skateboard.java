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
public class Skateboard extends Vihicle {
    private double myBoardLength;
    
    public Skateboard(){
        System.out.println("Skateboard");
    }
    
    public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }
    
}
