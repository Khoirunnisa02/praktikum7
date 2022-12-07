public class pembeli {
    private int id_pembeli;
    private String email;
    private String pass;
    private String nm_lengkap;
    private int no_telp;
    private Keranjang keranjang;

    public void setId_pembeli(int id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public int getId_pembeli() {
        return id_pembeli;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setNm_Lengkap(String nm_lengkap) {
        this.nm_lengkap = nm_lengkap;
    }

    public String getNm_lengkap() {
        return nm_lengkap;
    }

    public void setNo_telp(int no_telp) {
        this.no_telp = no_telp;
    }

    public int getNo_telp() {
        return no_telp;
    }

    public void setKeranjang(Keranjang keranjang) {
        this.keranjang = keranjang;
    }

    public Keranjang getKeranjang() {
        return keranjang;
    }

    public void showPembeli() {
        System.out.println("Id Pembeli : " + getId_pembeli());
        System.out.println("Email : " + getEmail());
        System.out.println("Pass : " + getPass());
        System.out.println("Nama Lengkap : " + getNm_lengkap());
        System.out.println("NO Telpon : " + getNo_telp());
        System.out.println("");
    }
}