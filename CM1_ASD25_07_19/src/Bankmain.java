public class Bankmain {
    public static void main(String[] args) {
        while (true) {
            System.out.println(" ==========POLINEMA BANK==========");
            System.out.println("\n BANK MENU:");
            System.out.println("1. Data Norek");
            System.out.println("2. Search Data");
            System.out.println("3. Pencarian Transaksi (No Hp)");
            System.out.println("4. Pencarian Maksimal Final Saldo");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

             switch (pilih) {
             case 1:
                
                 break;
            case 2:
                
                break;
            case 3:
                
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