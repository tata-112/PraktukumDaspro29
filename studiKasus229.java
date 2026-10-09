
import java.util.Scanner;

public class studiKasus229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa\t\t\t\t\t\t: ");
        String nama = sc.nextLine();
        String status="";
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya)\t: ");
        String jenisKegiatan = sc.nextLine();

        
        if (jenisKegiatan.equalsIgnoreCase("belmawa")||jenisKegiatan.equalsIgnoreCase("bakroma")||jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Jumlah dokumen yang diupload\t\t\t\t: ");
            int jmlDokumen = sc.nextInt();
            if (jmlDokumen == 4) {
                System.out.print("Peringkat Juara\t\t\t\t\t\t: ");
                int peringkat = sc.nextInt();
                    if (peringkat >=1 && peringkat<=3) {
                    status ="Lolos! Jumlah Dokumen dan Peringkat Penghargaan Sudah sesuai"; 
                    } else {
                    status ="Dana penghargaan hanya diberikan untuk juara 1,2,3";
                    }
            } else {
               status="Dokumen tidak lengkap (kurang " +(4-jmlDokumen)+"), dana penghargaan tidak diberikan";
            }
            
        } else {
            status ="jenis kegiatan anda tidak memenuhi kriteria";
            
         }

        System.out.println("Status\t\t\t\t\t\t\t: "+status);
    }
}
