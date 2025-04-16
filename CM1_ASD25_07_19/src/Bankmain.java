import java.util.Scanner;
public class Bankmain {
    public static void main(String[] args) {
        ServiceTransaksi Serv = new ServiceTransaksi(5);
        Scanner sc = new Scanner(System.in);
    
        
        Bank b1 = new Bank("16039207 3084", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        Bank b2 = new Bank("16106017 0573", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
        Bank b3 = new Bank("16204104 2243", "Fuller", "Rosalia", "085-556-712-7062", "fuller@mail.com");
        Bank b4 = new Bank("16127055 0112", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.com");
        Bank b5 = new Bank("16106147 2416", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.com");

        
        Transaksi t1 = new Transaksi("TR-083", 500000, 200000, 700000, "23-04-2024", "Kredit", b2);
        Transaksi t2 = new Transaksi("TR-084", 500000, 150000, 650000, "23-04-2024", "Kredit", b4);
        Transaksi t3 = new Transaksi("TR-085", 300000, 100000, 200000, "23-04-2024", "Debit", b3);
        Transaksi t4 = new Transaksi("TR-086", 500000, 100000, 600000, "23-04-2024", "Kredit", b1);
        Transaksi t5 = new Transaksi("TR-081", 700000, 200000, 500000, "23-04-2024", "Debit", b5);

        Serv.Tambah(t1);
        Serv.Tambah(t2);
        Serv.Tambah(t3);
        Serv.Tambah(t4);
        Serv.Tambah(t5);

        while (true) {
            System.out.println(" ==========POLINEMA BANK==========");
            System.out.println("\n BANK MENU:");
            System.out.println("1. Data Norek ");
            System.out.println("2. Search Data ");
            System.out.println("3. Pencarian Transaksi (No Hp)");
            System.out.println("4. Pencarian Maksimal Final Saldo");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

             switch (pilih) {
             case 1:
             for (int i = 0; i < Serv.idx; i++) {
                Serv.Trs[i].bankAcc.tampilDataNorek();
                System.out.println();
                }
                 break;
            case 2:
            Serv.sortingASC();
            Serv.displayData();
                break;
            case 3:
            System.out.print("Masukkan No HP: ");
            String noHp = sc.nextLine();
            boolean ditemukan = false;
            for (int i = 0; i < Serv.idx; i++) {
                if (Serv.Trs[i].bankAcc.noHp.equals(noHp)) {
                    Serv.Trs[i].tampilDataTransaksi();
                    ditemukan = true;
                }
            }
            if (!ditemukan) {
                System.out.println("Data dengan No HP " + noHp + " tidak ditemukan.");
            }
        
                break;
            case 4:
            
                break;
            case 5:
                System.out.println("Program Selesai");
                sc.close();
                return;
                default:
                    System.out.println("Pilihan tidak valid !=");
            }
        }
    }
}