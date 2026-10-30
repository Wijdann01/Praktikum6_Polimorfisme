public class Freelancer extends Pegawai {
    private double tarifPerProyek;
    private int jumlahProyek;

    public Freelancer(String id, String nama, double tarifPerProyek, int jumlahProyek) {
        super(id, nama);
        this.tarifPerProyek = tarifPerProyek;
        this.jumlahProyek = jumlahProyek;
    }

    @Override
    public double hitungGaji() {
        return tarifPerProyek * jumlahProyek;
    }
}