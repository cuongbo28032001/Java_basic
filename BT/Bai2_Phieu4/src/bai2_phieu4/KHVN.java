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
public class KHVN extends KhachHang{
    private String doiTuong;
    private int dinhMuc = 50;

    public KHVN(String doiTuong, String maKH, String tenKH, int soLuong, double donGia, int ngay, int thang, int nam) {
        super(maKH, tenKH, soLuong, donGia, ngay, thang, nam);
        this.doiTuong = doiTuong;
    }

    

    public KHVN() {
    }

    public KHVN(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
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

    public static void tieuDe() {
        KhachHang.tieuDe();
        System.out.printf("%15s %15s %15s\n", "Doi tuong", "Dinh muc", "Thanh tien");
    }
    @Override
    public void xuatKhachHang() {
        super.xuatKhachHang();
        System.out.printf("%15s %15d %15.2f\n", doiTuong, dinhMuc, ThanhTien());//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nhapKhachHang() {
        super.nhapKhachHang();
        System.out.print("Doi tuong khach hang: ");
        String str = super.sc.nextLine();
        doiTuong = str;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double ThanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia;
        } else {
            return dinhMuc * donGia + (soLuong - dinhMuc) * donGia * 2.5;
        }
    }

    @Override
    public void NhapDate() {
        super.NhapDate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "KHVN{" + "doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + '}'+super.toString();
    }
    
    
    
    
}
