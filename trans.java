import java.util.Arrays;

public class trans {
    private int id_detailTrans;
    private Arrays<produk> listproduk = new Arrays<>();

    public trans(int id_detailTrans) {
        this.id_detailTrans = id_detailTrans;
    }

    public int getId_DetailTrans() {
        return id_detailTrans;
    }

    public void setId_DetailTrans(int id_detailTrans) {
        this.id_detailTrans = id_detailTrans;
    }

    public void tambahProduk(Produk listproduk) {
        this.listproduk.add(listproduk);
    }

    public void showDetailTrans() {
        System.out.println(getId_DetailTrans());
        produk[] listproduk;
        for (produk produk : listproduk) {
            produk.showProduk();
        }
    }
}
