import java.util.Scanner;

public class Lat{
        public static void main(String args []){
            
        Scanner a = new Scanner (System.in);
        int jumlah_barang;
        int harga_barang;
        int harga_total;
        int harga_total_diskon;
        System.out.println("masukkan unit yang anda ingin beli");
        jumlah_barang = a.nextInt();
        System.out.println("masukkan harga barang");
        harga_barang = a.nextInt();
        harga_total = jumlah_barang*harga_barang;
        harga_total_diskon = jumlah_barang*harga_barang-(jumlah_barang*harga_barang*15/100);
        System.out.println("harga akhir ="+harga_total);
        System.out.println("harga akhir setelah diskon="+harga_total_diskon);    
        System.out.println();
        }
}