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
public class KHNN extends KhachHang{
    private String quocTich;

    public KHNN(String quocTich, String maKH, String tenKH, int soLuong, double donGia, int ngay, int thang, int nam) {
        super(maKH, tenKH, soLuong, donGia, ngay, thang, nam);
        this.quocTich = quocTich;
    }

    

    public KHNN() {
    }

    public KHNN(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public NgayHD getDate() {
        return date;
    }

    public void setDate(NgayHD date) {
        this.date = date;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }



    @Override
    public void xuatKhachHang() {
        super.xuatKhachHang();
        System.out.printf("%15s %15.2f\n", quocTich, ThanhTien());//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nhapKhachHang() {
        super.nhapKhachHang();
        System.out.print("Quoc tich khach hang: ");
        String str = super.sc.nextLine();
        quocTich = str;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ThanhTien() {
        return donGia*soLuong; //To change body of generated methods, choose Tools | Templates.
    }

        public static void tieuDe() {
        KhachHang.tieuDe();
        System.out.printf("%15s %15s\n", "Quoc tich", "Thanh tien");
    }
    @Override
    public void NhapDate() {
        super.NhapDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "KHNN{" + "quocTich=" + quocTich + '}' + super.toString();
    }

    
    
    
    
}
