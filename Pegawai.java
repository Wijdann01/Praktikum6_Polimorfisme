public class Pegawai {
    protected String nama;
    protected String id;

    public Pegawai (String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public double hitungGaji() {
        return 0;
    }


    public void cteakSlipGaji(){
        System.out.println("ID     : " + id);
        System.out.println("Nama   : " + nama);
        System.out.println("Gaji   : " + hitungGaji());
        System.out.println("======");
    }

    public String getTipePegawai(){
        return this.getClass().getSimpleName();
    }
}