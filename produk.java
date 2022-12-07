public class produk {
    private int id_Produk;
    private String nm_produk;
    private int harga;

    public produk(int id_Produk, String nm_produk, int harga) {
        this.id_Produk = id_Produk;
        this.nm_produk = nm_produk;
        this.harga = harga;
    }

    public int getId_Produk() {
        return id_Produk;
    }

    public void setId_Produk(int id_Produk) {
        this.id_Produk = id_Produk;
    }

    public void setNm_Produk(String nm_produk) {
        this.nm_produk = nm_produk;
    }

    public String getNm_Produk() {
        return nm_produk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getharga() {
        return harga;
    }

    public void showProduk() {
        System.out.println("Id Produk : " + getId_Produk());
        System.out.println("Nama Produk : " + getNm_Produk());
        System.out.println("Harga : " + getharga());
        System.out.println("");
    }
}
