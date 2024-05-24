public class HangSanXuat {
    private String tenHang;
    private String QuocGia;

    public HangSanXuat(String tenHang, String quocGia) {
        this.tenHang = tenHang;
        QuocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }
}
