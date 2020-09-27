/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakbejo2;

/**
 *
 * @author DIMAS SATRIA
 */
public class PakBejo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ---------------------- NON VOID -------------------------//
        Keramik kA = new Keramik();
        kA.harga  = 54000 ;
        kA.isi    = 10;
        kA.ukuran = 30*30;
        System.out.println("Jumlah box yang dibutuhkan = " + kA.jumlahBox() + "box" );
        System.out.println("Harga keramik = Rp." + kA.hargaKeramik() );
        
        Keramik kB = new Keramik();
        kB.harga  = 65000;
        kB.isi    = 5;
        kB.ukuran = 40*40;
        System.out.println("Jumlah box yang dibutuhkan = " + kB.jumlahBox() + "box" );
        System.out.println("Harga Keramik = Rp." + kB.hargaKeramik() );
        
        Keramik kC = new Keramik();
        kC.harga  = 60000;
        kC.isi    = 8;
        kC.ukuran = 30*40;
        System.out.println("Jumlah box yang dibutuhkan = " + kC.jumlahBox() + "box" );
        System.out.println("Harga Keramik = Rp." + kC.hargaKeramik() );
        
        //---------------------- Constructor ---------------------//
        keramik2 kA1 = new keramik2(30*30, 54000, 10);
        kA1.hitungHarga();
        keramik2 kB1 = new keramik2(40*40, 65000, 5);
        kB1.hitungHarga();
        keramik2 kC1 = new keramik2(30*40, 60000, 8);
        kC1.hitungHarga();
    }
    
}
