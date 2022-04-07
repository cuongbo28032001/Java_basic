/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TienDien;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class KhachHang {
    public int maKH;
    public String hoTen;
    public NgayHD date;
    public ThanhTien thanhTien;
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");     maKH = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap ten khach hang: ");      hoTen = sc.nextLine();
        date = new NgayHD();
        date.Nhap();
        thanhTien = new ThanhTien() {};
        thanhTien.Nhap();
    }

    @Override
    public String toString() {
        return '{' + "maKH: " + maKH + ", hoTen: " + hoTen + ", NgayHD: " + date + ", thanhTien: " + thanhTien + '}';
    }
}
