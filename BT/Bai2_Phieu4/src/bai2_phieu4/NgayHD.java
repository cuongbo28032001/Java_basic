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
public class NgayHD {
    protected Scanner sc = new Scanner(System.in);
    protected int ngay,thang,nam;

    public NgayHD(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public NgayHD() {
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
    
    public void NhapDate()
    {
        System.out.print("Nhập ngày: ");        ngay = sc.nextInt();
        System.out.print("Nhập tháng: ");        thang = sc.nextInt();
        System.out.print("Nhập năm: ");        nam = sc.nextInt();
    }

    @Override
    public String toString() {
        return "NgayHD{" + "sc=" + sc + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + '}';
    }
    
    
}
