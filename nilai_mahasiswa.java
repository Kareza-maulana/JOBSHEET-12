import java.util.Arrays;
import java.util.Scanner;

public class nilai_mahasiswa {
    static Scanner input = new Scanner(System.in);
    static int jumlah;
    static int[] nilai;

    static void input_nilai(){
         
         
        System.out.println("berapa nilai yang ingin anda masukkan?");
            jumlah= input.nextInt();
             nilai = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan nilai mahasiswa ke " + (i+1) + ": ");
            nilai[i] = input.nextInt();

}}
static void tampil_nilai(int...nilai){
    System.out.println("Nilai mahasiswa: " + Arrays.toString(nilai));
}
static int hitung_total(){
    int total = 0;
    for (int n : nilai){
        total += n;
    }
    return total;
}

public static void main(String[] args) {
    input_nilai();
    tampil_nilai(nilai);
    int total_nilai = hitung_total();
    System.out.println("Total nilai mahasiswa: " + total_nilai);
   
}}
