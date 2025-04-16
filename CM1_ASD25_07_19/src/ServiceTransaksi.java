public class ServiceTransaksi {
    
    int CariTrsNohp (String CariNo) {
        int posisi = -1;
        for (int j = 0; j < Trs.length; j++) {
            if (Trs[j].ipk== CariNo) {
                posisi = j;
                break;
            }
        }
        return posisi;

    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan (ASC)!");
    }
}
