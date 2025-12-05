import java.util.Scanner;

public class PERCOBAAN3 {

public static void menu(){
    System.out.println("===MENU RESTO CAFE===");
    System.out.println("1. kpi hitam - 15,000");
    System.out.println("2. cappucino - 20,000");
    System.out.println("3. latte - 25,000");
    System.out.println("4. teh tarik - 10,000");
    System.out.println("5. roti bakar - 10,000");
    System.out.println("3. min goreng - 20,000");
    System.out.println("==========================");
    System.out.println("Silahkan pilih menu yang anda inginkan:");
}
public static int hitung_harga(int menu, int jumlah, String diskon){

int[] hargaItem={15000,20000,25000,10000,10000,20000};
if(diskon.equals("DISKON50%")){
    int total_harga=(hargaItem[menu-1]*jumlah)/2;
    return total_harga;
}
else if(diskon.equals("DISKON30%")){
    int total_harga=(hargaItem[menu-1]*jumlah*70)/100;
    return total_harga;
}else {
    int total_harga=hargaItem[menu-1]*jumlah;
    return total_harga;
}

}
public static void main(String[] args) {
    int total_bayar=0;

    Scanner input = new Scanner(System.in);
    System.out.println("Selamat datang di Resto Cafe");
    System.out.println("=============================");
    while (true){
    System.out.println("Silahkan pilih menu berikut:");
    menu();
    System.out.println("MENU ANDA");
    int menu = input.nextInt();
    System.out.println("Jumlah pesanan:");
    int jumlah = input.nextInt();
    System.out.println("MASUKAN KODE DISKON (jika tidak ada masukkan 'TIDAK ADA'):");
    String diskon = input.next();
    int total_harga= hitung_harga(menu, jumlah, diskon);
    total_bayar += total_harga;
    System.out.println("Apakah anda ingin memesan lagi? (ya/tidak)");
    String jawab = input.next();
    if(jawab.equalsIgnoreCase("tidak")){
        break;
    }
}
System.out.println("Total harga yang harus dibayar: "+ total_bayar);
    
}
}