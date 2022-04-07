package HoaDon_KhachHang_SVThucHanh;

import java.util.Scanner;

public class Hang {
    private String tenHang;
    private double soLuong;
    private double donGia;

    /**
     * nhập thuộc tính tên hàng, số lượng, đơn giá
     */
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten hang: ");
        tenHang = s.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = s.nextDouble();
        System.out.print("Nhap don gia: ");
        donGia = s.nextDouble();
    }

    /**
     * 
     * @return số lượng* đơn giá
     */
    public double tinhTongTien() {
        return soLuong * donGia;
    }

    /**
     * bổ sung xâu định dạng tương ứng với các 4 dữ liệu
     * 
     * @biểu diễn các tiêu đề cho cột hàng trong hóa đơn
     */
    public static void inTieuDe() {
        System.out.printf("-%10s -%10s -%10s -%10s -%15s %n",
                "ten hang", "so luong", "don gia",
                "thanh tien");
    }

    /**
     * bổ sung xâu định dạng in dữ liệu thẳng hàng với tiêu đề
     */
    public void inDL() {
        System.out.printf("%10s -%10.1f -%10.1f -%15.1f %n",
                tenHang, soLuong, donGia, tinhTongTien());
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }
    
}
