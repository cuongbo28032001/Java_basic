package HoaDon_KhachHang_SVThucHanh;

import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String hoTen;
    private String diaChi;

    /**
     * Nhập các thuộc tính: Mã khách, họ tên, địa chỉ
     */
    public void nhap() {
        // chú ý với scanner khi nhập số- xâu
        Scanner s = new Scanner(System.in);

        // nhap thong tin khach hang
        System.out.print("Nhap ma KH: ");
        maKH = s.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = s.nextLine();
    }

    /**
     * @return : Xâu kết xuất thông tin khách
     *         có định dạng phù hợp như mẫu in trong phiếu hóa đơn
     */
    public String toString() {        
        return "ma KH: " + maKH + " \t ten KH: " + hoTen + " \t dia chi: " + diaChi;
    }
}
