/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan19.saldotabungan;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung saldo tabungan dengan bunga 15%
 */
public class PBO11K10118901Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 2500000;
        double bunga;
        for(int i = 1; i<= 6; i++) {
            bunga = saldo * 0.15;
            saldo = (int) (saldo + bunga);
//            System.out.print("Saldo Bulan ke-"+i+" Rp.");
            System.out.printf("Saldo Bulan ke-"+i+" Rp.%,10d%n",saldo);
        }
    }
    
}
