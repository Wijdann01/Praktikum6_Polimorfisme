import java.util.ArrayList;

public class MainPenggajian {
    public static void main(String[] args) {
        Manajer m1 = new Manajer("M001", "Budi Santoso", 15000000, 5000000);
        Staff s1 = new Staff("S001", "Siti Aminah", 50000, 160);
        Staff s2 = new Staff("S002", "Andi Wijdaya", 50000, 172);
        Freelancer f1 = new Freelancer("F001", "Wijdan Fathu Rohman", 1000000, 3);

        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(m1);
        daftarPegawai.add(s1);
        daftarPegawai.add(s2);
        daftarPegawai.add(f1);

        System.out.println("====Slip Gaji====");
        for (Pegawai p :daftarPegawai){
            System.out.println("Tipe Objek: " + p.getTipePegawai());
            p.cteakSlipGaji();
        }

        System.out.println("===Cek Tipe Objek===");
        for (Pegawai p: daftarPegawai){
            if(p instanceof Manajer){
                System.out.println(p.nama + " adalah Manajer (dapat tunjangan)");
            } else if (p instanceof Staff){
                System.out.println(p.nama + " adalah Staff (gaji per jam)");
            } else if (p instanceof Freelancer){
                System.out.println(p.nama + " adalah Freelancer (gaji per proyek)");
            }
        }
        double totalPengeluaran = 0;
        for (Pegawai p : daftarPegawai){
            totalPengeluaran += p.hitungGaji();
        }

        System.out.println("\nTotal Pengeluaran Perushaan: Rp " + totalPengeluaran);
    }
}

