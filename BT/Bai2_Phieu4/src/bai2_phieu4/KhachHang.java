/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_phieu4;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class KhachHang extends NgayHD{
    protected Scanner sc = new Scanner(System.in);
    protected String maKH;
    protected String tenKH;
    protected NgayHD date = new NgayHD();
    protected int soLuong;
    protected double donGia;

    public KhachHang(String maKH, String tenKH, int soLuong, double donGia, int ngay, int thang, int nam) {
        super(ngay, thang, nam);
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    
    

    public KhachHang() {
    }
    
    public double ThanhTien()
    {
        return 0;
    }
    
    public void nhapKhachHang() {
        System.out.print("Ma khach hang: ");
        String str = sc.nextLine();
        maKH = str;
        System.out.print("Ho ten: ");
        str = sc.nextLine();
        tenKH = str;
        System.out.print("Ngay ra hoa don (dd/mm/yyyy): ");
        date.NhapDate();
        System.out.print("So luong: ");
        int soLuong = sc.nextInt();
        this.soLuong = soLuong;
        System.out.print("Don gia: ");
        double donGia = sc.nextDouble();
        this.donGia = donGia;
        sc.nextLine();
    }

     public static void tieuDe() {
        System.out.printf("%15s %15s %15s %15s %15s", "Ma KH", "Ho ten", "Ngay ra HD", "So luong", "Don gia");
    }

    public void xuatKhachHang() {
        System.out.printf("%15s %15s %15s %15d %15.2f", maKH, tenKH, date.ngay+"/"+date.thang+"/"+date.nam, soLuong, donGia);
    }
    @Override
    public String toString() {
        return "KhachHang{" + "sc=" + sc + ", maKH=" + maKH + ", tenKH=" + tenKH + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    
}
