PERTANYAAN PERCOBAAN 1

1.Apakah fungsi tanpa parameter selalu harus bertipe void? TIDAK
2.Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu
tanpa menggunakan fungsi!
BISA DENGAN LANGSUNG MENULIS KODE PROGRAM TERSEBUT DIDALAM FUNGSI MAIN
3.Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
perintah penampilan menu langsung di dalam fungsi main.

untuk menyederhanakan program dan membuat program lebih fleksibel karena saat ingin menggunakan sebuah fungsi tinggal memanggil fungsi tersebut tanpa menulis ulang kode
4.Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main
(mulai dari program dijalankan sampai daftar menu tampil di layar).

start - memangggil fungsi - membaca setiap baris dari funsi menu() - menapilkan output -
end

PERTANYAAN PERCOBAAN 2

1. Apakah kegunaan parameter di dalam fungsi?
untuk membuat fungsi lebih dinamis dan bisa menyesuaikan inputannya
2. Apakah kegunaan parameter di dalam fungsi?
karena variabel yang akan diesekusi didalam fungsi tersebut adalah varibel ```nama_pelanggan``` dan ```member```
3. Apakah parameter sama dengan variabel? Jelaskan
ya variabel sama dengan parameter hanya saja parameter adalah variabel yang ada didalam input dan bisa menerima nilai dari pemanggil fungsi
4.Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa
perbedaan output ketika isMember bernilai true dan ketika false?
fungsi ismember adala mengisi nilai pada if-condition ketika ismember bernilai true maka if akan dijalankan namun saat bernilai false maka fungsi if tidak akan dijalankan 
5.Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter
namaPelanggan dan isMember? program akan error 
6.Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang
berlaku, tampilkan kode invalid.

```
 public static void menu(String nama_pelanggan , boolean member, String diskon){
        System.out.println("selamat datang "+ nama_pelanggan);
        switch(diskon){
            case "50%":
                System.out.println("Anda mendapatkan diskon 50%");
                break;
            case "30%":
                System.out.println("Anda tidak mendapatkan 30%");
                break;
            default:
                System.out.println("invalid diskon");
        }
        if(member){
            System.out.println("Selamat datang "+ nama_pelanggan + " Anda mendapatkan diskon 10% ");}
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
```

7.Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris
perintah pemanggilan fungsi menu yang benar.
```
 public static void main(String[] args){
        menu("budi", true,"DISKON30%" );
    }
```
8.Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
Jelaskan alasan Anda.
ya, karena menggunakan parameter memmuudahlan penentuan nilai yyang akan di eksekusi daripada harus menulis nilai didalam fungsi yang menyebabkan fungsi menjadi lebih statis

PERTANYAAN PERCOBAAN 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh
dari program kafe pada Percobaan 3 untuk masing-masing kasus.
fungsi memerlukan return value ketika fungsi berisi sebuah operasi yang menghasilkan nilai dan perlu mengembalikan nilai yang dihasilkan ke main fungsi , contoh:
 ```
public static int hitung_harga(int menu, int jumlah){
int[] hargaItem={15000,20000,25000,10000,10000,20000};
int total_harga=hargaItem[menu-1]*jumlah;
return total_harga;

```
dan fungsi yang tidak memerlukan return adalah fungsi yang melkukan suatu aksi namun tidak menghasilkan nilai sehingga tidak perlu mengirim nilai kembalian ke main fugsi
contoh:
```
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
```
2.Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing
parameter dalam konteks program kafe.

tipe data yang digunakan dalam fungsi tersebut adlah integer , dan parameter yang digunakan dalam funsi tersebut adalah menu dan jumlah_pesanan, artinya kedua parameter tersebut akan diisi nilai saat pemnggilan fungsi.

3.Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga
totalHarga.
```
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
```
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis
menu)? 

PERTANYAAN PERCOBAAN 4
1.Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...
namaPengunjung!
untuk membuat parameter dapat menerima input yang tidak terbatas , sehingga membuat program lebih fleksibel dalam menerima input

2.

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban
Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
tidak bisa , dalam aturan penulisan program di java tidak bisa menulis lebih dari satu varargs , 
contoh :
```
static string nama_siswa(String...nama, String...siswa)
```
4.Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?
Jika tetap berjalan, bagaimana output yang dihasilkan?
jika fugnsi dipanggil tanpa argumen fungsi tetAP berjalan namun tidak ada data yang ditampilkan

PERTANYAAN PERCOBAAN 5
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program
dijalankan hingga menampilkan luas persegi panjang dan volume balok!

mulai - meminta input - memanggil fungsi dengan memasukan nilai inputan ke dalam parameter fungsi-
menampilkan output

2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur
jalannya program sampai output tersebut muncul.
```
Luas balok adalah: 94  
Volume balok adalah: 60
```
program menerima input - input dimasukan kedalam parameter fungsi - program menampilan output

3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program
tersebut!

1.Baris 17 (main): Program menghitung 1 + 1, hasilnya 2 (disimpan di variabel temp).
2.Baris 18 (main): Program mengirim angka 2 (temp) dan 5 ke method TampilJumlah.

3.Baris 13 (TampilJumlah): Angka tadi dijumlahkan dulu: 2 + 5, hasilnya 7.

4.Baris 2 (TampilHinggaKei): Angka 7 dikirim ke sini. Program melakukan looping untuk mencetak   angka dari 1 sampai 7.

Output: 1234567
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak?
Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak?
Jelaskan!

fungsi membutuhkan parameter ketika fungsi tersebut ignin menerima input yang dinamis tidak terbatas pada nilai tetap yang dioperasikan disalam fungsi, dan fungsi membutuhkan return ketika fungsi tersebut butuh mengembalikan nilai kedalam main untuk bisa di ditampilkan

5.elaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi
boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume
di Percobaan 5.
fungsi sebaiknyan menggunkan parameter ketika ingin membuat program lebih fleksibel dan dan dinamis,
fungsi boleh tanpa parameter ketika data yang dakan digunakan suda tersedia disalam class(data statis) 
6.Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan
kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main,
hitungLuas, dan hitungVolume.

sebuah fungsi sebaiknya menggunakan return ketika nilai yang sudah dihasilkan dari suatu fungsi tidak langsung ditampilkann atau perlu dipakai lagi untuk operaasi berikutnya , dan fungsi boleh tanpa menggunakan return ketika nilai yang dihasilkan di dalam fungsi langsng dicetak/ditampilkan menggunakan fungsi tersebut




