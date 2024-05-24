public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private double giaVe;
    private HangSanXuat hsx;
    private NgayChieu ngayChieu;

    public BoPhim(String tenPhim, int namSanXuat, double giaVe, HangSanXuat hsx, NgayChieu ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.giaVe = giaVe;
        this.hsx = hsx;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public HangSanXuat getHsx() {
        return hsx;
    }

    public void setHsx(HangSanXuat hsx) {
        this.hsx = hsx;
    }

    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
}
