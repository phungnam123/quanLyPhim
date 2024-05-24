public class Test {
    public static void main(String[] args) {
        NgayChieu nc = new NgayChieu(25,4,2019);
        NgayChieu nc2 = new NgayChieu(6,7,2022);

        HangSanXuat hsx = new HangSanXuat("Wang Dulu","Trung Quốc" );
        HangSanXuat hsx2 = new HangSanXuat("The LEGO","Mỹ" );
        
        BoPhim phim = new BoPhim("The LEGO Movie", 2014, 120000, hsx, nc);
        BoPhim phim2 = new BoPhim("Bích Huyết Kiếm", 2000, 200000, hsx2, nc2);


    }
}
