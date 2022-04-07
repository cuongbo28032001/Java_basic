package HoaDon_KhachHang_SVThucHanh;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HoaDon {
    private String soHD;
    private int soMatHang;
    private KhachHang kh = new KhachHang();
    private Hang dsHang[];
    NgayThang ngayHD = new NgayThang(1, 1, 2020);

    /**
     * Nhập số HĐ,
     * nhập số mặt hàng n;
     * nhập khách
     * xin cấp phát mảng; nhập mảng hàng.
     * nhập ngày
     */
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so HD: ");
        soHD = s.nextLine();

        System.out.print("Nhap so mat hang: ");
        soMatHang = s.nextInt();

        System.out.print("Nhap khach hang: ");
        kh.nhap();
        dsHang = new Hang[soMatHang];

        for (int i = 0; i < soMatHang; i ++) {
            System.out.print("Nhap hang thu : " + i+1);
            dsHang[i].nhap();
        }

        System.out.print("Nhap ngay lap: ");
        ngayHD = new NgayThang(s.nextInt(), s.nextInt(), s.nextInt());


    }// end of nhap()

    public double tinhTongTien() {
        // sv tự làm tính tổng số lượng*đơn giá
        return 0;
    }

    public void inHD() {
        DecimalFormat df = new DecimalFormat("###,###.0#");

    }

    /**
     * Sắp xếp danh sách hàng hóa theo 1 tiêu chí bất kỳ
     * public int compare trả lại
     * 0 nếu đưa tiêu chi so sánh t =t1
     * >0 nếu t>t1
     * <0 nếu t<t1
     */
    public void sapXep() {
        Comparator<Hang> c1 = new Comparator<Hang>() {
            @Override
            public int compare(Hang arg0, Hang arg1) {
                return arg0.getTenHang().compareToIgnoreCase(arg1.getTenHang());
            }
        };
        Arrays.sort(dsHang, c1);
    }

    public Hang timMin() {
        Comparator<Hang> c = new Comparator<Hang>() {
            @Override
            public int compare(Hang t, Hang t1) {
                // sap xep theo so luong
                
            }
        };
        return null;
    };
}// end of class
