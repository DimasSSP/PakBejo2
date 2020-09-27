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
public class keramik2 {
    int ukuran;
    int harga;
    int isi;
    int luas = 1000000; //luas dalam cm2
    
    // Constructor
    keramik2 (int u, int h, int i){
        this.ukuran = u;
        this.harga = h;
        this.isi = i;
    }
    
    void hitungHarga(){
        int jumlah;
        int totalBox;
        int hargaTotal;
        
        jumlah = this.luas / this.ukuran ;
        totalBox = jumlah / this.isi ;
        hargaTotal = totalBox * this.harga ;
        System.out.println("Jumlah box = " + totalBox );
        System.out.println("Total Harga Keramik = Rp." + hargaTotal );
    }
   
}
