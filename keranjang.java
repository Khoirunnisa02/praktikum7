public class keranjang {
    private int id_Keranjang;
    private int jumlah;
    private produk produk;

    public int getid_keranjang() {
        return id_Keranjang;
    }

    public void setid_keranjang(int id_Keranjang) {
        this.id_Keranjang = id_Keranjang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public produk getproduk() {
        return produk;
    }

    public void setproduk(produk produk) {
        this.produk = produk;
    }

    public void showKeranjang() {
        System.out.println("Id Keranjang : " + getid_keranjang());
        System.out.println("Jumlah : " + getJumlah());
        System.out.println("");
    }
}