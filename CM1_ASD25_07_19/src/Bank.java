public class Bank {
    String noRekening;
    String nama;
    String namaIbu;
    String noHp;
    String email;

    Bank(String noRekening, String nama, String namaIbu, String noHp, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }

    void tampilDataNorek() {
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Nama: " + nama);
        System.out.println("Nama Ibu: " + namaIbu);
        System.out.println("No Hp: " + noHp);
        System.out.println("Email: " + email);
    }
}
