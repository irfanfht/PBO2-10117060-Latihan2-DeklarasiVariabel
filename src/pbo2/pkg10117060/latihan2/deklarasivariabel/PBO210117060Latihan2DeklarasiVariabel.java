/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan2.deklarasivariabel;

/**
 *
 * * @author 
 * NAMA : Irfan Faisal Hutama Tanjung.
 * KELAS : PBO2
 * NIM : 10117060
 * Deskripsi Program : Program ini berisi mendeklarasikan variabel dan 
 * menampilkannya ke layar.
 */
public class PBO210117060Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi Variabel
        int nilaiInt;
        final double PHI = 3.14; //Konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke Variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan Hasil ke Layar
        System.out.println("");
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
    
}
