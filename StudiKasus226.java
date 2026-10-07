import java.util.Scanner;

public class StudiKasus226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        System.out.print("Peringkat juara: ");
        int peringkatJuara = sc.nextInt();

        int kurangDokumen = 4 - jumlahDokumen;

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Memenuhi syarat. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : Tidak memperoleh Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status : Memenuhi syarat. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }

            } else {
                System.out.println("Status : Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Kegiatan di luar ketentuan tidak memperoleh dana penghargaan.");
        }
    }
}