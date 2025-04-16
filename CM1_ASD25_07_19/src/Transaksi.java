public class Transaksi {

    String kodeTranskasi;
    double saldo;
    double inOutSaldo;
    double finalSaldo;
    String tanggalTransaksi;
    String type;
    Bank bankAcc = new Bank();

    Transaksi(String kodeTranskasi, double saldo, double inOutSaldo, double finalSaldo, String tanggalTransaksi, String type, Bank bankAcc) {
        this.kodeTranskasi = kodeTranskasi;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalSaldo = finalSaldo;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type; 
    }

    void tampilDataTransaksi() {
        System.out.println("Kode Transaksi " + kodeTranskasi);
        System.out.println("No Rekening " + bankAcc.noRekening);
        System.out.println("Saldo " + saldo);
        System.out.println("Debit/Kredit" + inOutSaldo);
        System.out.println("FInal Saldo " + finalSaldo);
        System.out.println("Tanggal Transaksi " + tanggalTransaksi);
        System.out.println("Type " + type);
    }

}


