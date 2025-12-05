public class PERCOBAAN4 {
    static void nama_pengunjung(String...namapengunjung){
        System.out.println("daftar nama pengunjung ");
        for (String nama : namapengunjung){
            System.out.println(nama);
        }
    }
    public static void main(String[] args) {
        nama_pengunjung("andi","budi","caca","dodi","erik");
        nama_pengunjung("doni");
        nama_pengunjung("dinda", "regi");
        nama_pengunjung();
        System.out.println();
    }
}
