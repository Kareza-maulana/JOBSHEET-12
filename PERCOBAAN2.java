public class PERCOBAAN2 {
    public static void menu(String nama_pelanggan , boolean member, String diskon){
        System.out.println("selamat datang "+ nama_pelanggan);
        switch(diskon){
            case "DISKON50%":
                System.out.println("Anda mendapatkan diskon 50%");
                break;
            case "DISKON30%":
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
    public static void main(String[] args){
        menu("budi", true,"DISKON30%" );
    }
}
