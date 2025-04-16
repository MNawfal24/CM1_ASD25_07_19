public class ServiceTransaksi {
    Transaksi[] Trs = new Transaksi[5];
    int idx = 0;

    ServiceTransaksi(int kapasitas) {
        Trs = new Transaksi[kapasitas];
    }

    void displayData() {
        for (Transaksi transaksi : Trs) {
            transaksi.tampilDataTransaksi();
        }
    }
}
