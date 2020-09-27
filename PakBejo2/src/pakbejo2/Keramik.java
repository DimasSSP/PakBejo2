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
public class Keramik {
    int ukuran;
    int harga;
    int isi;
    int luas = 1000000; // luas dalam bentuk cm2
    
//------------------------- Non Void ----------------------------
    int jumlahKeramik(){
        int jumlah;
        jumlah = this.luas / this.ukuran;
        return jumlah;
    }
    
    int jumlahBox(){
        int totalBox;
        totalBox = this.jumlahKeramik()/this.isi;
        return totalBox;
    }
    
    int hargaKeramik(){
        int hargaTotal;
        hargaTotal = (this.jumlahBox() * this.harga);
        return hargaTotal;
    }
    
}
