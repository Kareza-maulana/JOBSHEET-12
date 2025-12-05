
import java.util.Scanner;
import java.util.Arrays;

public class PENJUALANAN_KAFE {

    static int[][] data_penjualan;
    static Scanner input = new Scanner(System.in);
    static int jumlah_hari;
    static int jumlah_menu;
    static String[] nama_menu;
    static int[] total_penjualan_menu;
    static int[] rata_rata;
    static int total_keseluruhan = 0;

    static void input_penjualan (){
        System.out.print("Masukan jumlah menu: ");
        jumlah_menu = input.nextInt();
        System.out.print("Masukan jumlah hari : ");
        jumlah_hari = input.nextInt();
        nama_menu = new String[jumlah_menu];
        data_penjualan = new int[jumlah_menu][jumlah_hari];
        total_penjualan_menu = new int[jumlah_menu];
        for (int i = 0; i < jumlah_menu; i++) {
            System.out.print("Masukan nama menu ke-" + (i + 1) + ": ");
            int total = 0;
            nama_menu[i] = input.next();
            for (int j = 0; j < jumlah_hari; j++) {
                System.out.println("masukan jumlah penjualan " + nama_menu[i] + " pada hari ke-" + (j + 1) + ": ");
                data_penjualan[i][j] = input.nextInt();
                total += data_penjualan[i][j];
                total_keseluruhan += data_penjualan[i][j];

            }

           total_penjualan_menu[i]= total ;
            
        }
       
    }
    static int penjualan(){
    for (int i=0 ; i<total_penjualan_menu.length; i++){

            rata_rata = new int[]{total_penjualan_menu[i] / jumlah_hari};
            
        }
        return rata_rata[0];
    }
    static void tampil_data(){
        System.out.println("===Data Penjualan Kafe===");
        for (int i=0 ; i<jumlah_menu; i++){
            System.out.println("Data penjualan " + nama_menu[i]+ " selama " + jumlah_hari + " hari:"+ Arrays.toString(data_penjualan[i]));
            
            System.out.println();
        }

    }

    public static void main (String[] args) {
        input_penjualan();
        tampil_data();
        for (int i=0; i<jumlah_menu; i++){
            System.out.println("Total penjualan " + nama_menu[i] + " selama " + jumlah_hari + " hari: " + total_penjualan_menu[i]);
        }
        System.out.println("Total penjualan selama " + jumlah_hari + " hari: " + total_keseluruhan);
        System.out.println("Rata-rata penjualan per hari: " + penjualan());
        int penjualan_tertinggi = total_penjualan_menu[0];
        String nama_menu_tertinggi = nama_menu[0];
        for(int i=0 ; i<total_penjualan_menu.length; i++){
            
            if (total_penjualan_menu[i]>penjualan_tertinggi){
                penjualan_tertinggi = total_penjualan_menu[i];
                nama_menu_tertinggi = nama_menu[i];
                
            }
            
        }
        System.out.println("Penjualan tertinggi adalah: "+ nama_menu_tertinggi + " dengan jumlah " + penjualan_tertinggi);
    }

}