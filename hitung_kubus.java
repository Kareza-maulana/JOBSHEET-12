import java.util.Scanner;

public class hitung_kubus {
    static int luas_balok(int p, int l, int t){
        int luas = 2 * (p*l + p*t + l*t);
        return luas;
    }
    static int volume_balok(int p, int l, int t){
        int volume = p * l * t;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang balok:");
        int p = input.nextInt();
        System.out.println("Masukkan lebar balok:");
        int l = input.nextInt();
        System.out.println("Masukkan tinggi balok:");
        int t = input.nextInt();

        int luas = luas_balok(p, l, t);
        int volume = volume_balok(p, l, t);

        System.out.println("Luas balok adalah: " + luas);
        System.out.println("Volume balok adalah: " + volume);
    }
}
