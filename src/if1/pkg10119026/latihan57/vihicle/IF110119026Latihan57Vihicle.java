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
public class IF110119026Latihan57Vihicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bike = new Bicycle();
        bike.setMyBrand("Trek Bike");
        bike.setModel("7.4FX");
        bike.setGearCount(23);
        System.out.println("Brand  : "+bike.getBrand());
        System.out.println("Model  : "+bike.getModel());
        System.out.println("Jumlah Gear  : "+bike.getGearCount()+"\n");

        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setModel("Rocket");
        skate.setBoardLength(54.5);
        System.out.println("Brand   : "+skate.getBrand());
        System.out.println("Model   : "+skate.getModel());
        System.out.println("Panjangnya board  : "+skate.getBoardLength());
    }
    
}
