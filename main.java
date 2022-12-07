public class main {

    public static void main(String[] args) {
        keranjang k = new keranjang();
        k.setid_keranjang(354);
        k.setJumlah(26);
        k.showKeranjang();
        pembeli p1 = new pembeli();
        p1.setId_pembeli(001);
        p1.setEmail("khoirunn.356");
        p1.setPass("12345");
        p1.setNm_Lengkap("Khoirunnisa");
        p1.setNo_telp(17);
        p1.showPembeli();
        produk pr = new produk(780, "cofee paste", 12000);
        // pr.setId_Produk(789);
        // pr.setNm_Produk("coffe paste");
        // pr.setHarga(12000);
        pr.showProduk();
        DetailTrans dt = new DetailTrans(12345678);
        dt.tambahProduk(pr);
        dt.showDetailTrans();

        transaksi t = new transaksi(p1, dt);
        t.setid_Transaksi(100);
        t.setTnggl(26072020);
        // t.setPembeli(p1);
        t.setStatus("Berhasil");
        // t.setDt(dt);
        t.showTransaksi();

    }
}
