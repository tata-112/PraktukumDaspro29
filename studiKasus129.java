

import java.util.Scanner;

public class studiKasus129 {
    public static void main(String[] args) {
        /*hargaPerCup = 15000 + (29%6)x 1000 = 20000  gantikan 18000
        Syarat minimal belanja = 80000 + (29%5)x10000 = 120000  gantikan 100000
        persentase diskon = 5 + (29%6)% = 10%  gantikan 10%*/

        Scanner bitha = new Scanner(System.in);

        int hargaPerCup = 20000;
        int jumlahCup;
        int uangBayar;
        int totalHarga;
        int diskon;
        int totalBayar;
        int kembalian,kurang;

        System.out.print("Masukkan jumlah cup\t: ");
        jumlahCup = bitha.nextInt();
        System.out.print("Masukkan uang bayar\t: ");
        uangBayar = bitha.nextInt();

        totalHarga = jumlahCup *hargaPerCup;
        System.out.println("Total harga\t\t: "+ totalHarga);
        
        if (totalHarga >= 120000) {
            diskon = totalHarga*10/100;
        } else {
            diskon =0; 
        }
        totalBayar = totalHarga-diskon;
        System.out.println("Diskon\t\t\t: "+diskon);
        System.out.println("Total Bayar\t\t: "+totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar-totalBayar;
            System.out.println("kembalian\t\t: "+kembalian);
        } else {
            kurang = totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp"+kurang);
        }

    }
    
}