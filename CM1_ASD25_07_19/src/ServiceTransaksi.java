public class ServiceTransaksi {
    Transaksi[] Trs = new Transaksi[5];
    Bank bankAcc = new Bank();
    int idx = 0;

    ServiceTransaksi(int kapasitas) {
        Trs = new Transaksi[kapasitas];
    }

    void Tambah(Transaksi t) {
        if (idx < Trs.length) {
            Trs[idx] = t;
            idx++;
        } else {
            System.out.println("Kapasitas data transaksi penuh!");
        }
    }
    void displayData() {
        for (Transaksi transaksi : Trs) {
            transaksi.tampilDataTransaksi();
        }
    }

    public void CariNoHp(String CariNo) {
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (Trs[i].kodeTranskasi.equals(CariNo)) {
                System.out.println("Data ditemukan:");
                Trs[i].tampilDataTransaksi();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Data dengan kode transaksi " + CariNo + " tidak ditemukan.");
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
         for (int j = 1; j < idx - i; j++) {
            if (Trs[j - 1].bankAcc.noRekening.compareToIgnoreCase(Trs[j].bankAcc.noRekening) > 0) {
                 Transaksi temp = Trs[j - 1];
                    Trs[j - 1] = Trs[j];
                    Trs[j] = temp;
             }
         }
        }
        System.out.println("Data berhasil diurutkan berdasarkan noRekening ! ");
    
    }

    
}
