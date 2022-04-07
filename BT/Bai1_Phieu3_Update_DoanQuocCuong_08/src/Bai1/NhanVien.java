/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class NhanVien {

    private String maNV;
    private int soSP;
    final int vuotChuan = 500;
    final int salaryPerone = 20000;
    final int salaryPass = 30000;

    public NhanVien() {
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) throws Exception {
        if(maNV.isEmpty()) throw new Exception("not null");
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) throws Exception {
        if (soSP < 0) {
            throw new Exception("soSP > 0");
        }
        this.soSP = soSP;
    }

    public boolean coVuotChuan() {
        if (soSP > vuotChuan) {
            return true;
        }
        return false;
    }

    public double getLuong() {
        if (coVuotChuan()) {
            return (soSP - vuotChuan) * salaryPass + vuotChuan * salaryPerone;
        } else {
            return soSP * salaryPerone;
        }
    }

    public String getTongKet() {
        if (coVuotChuan()) {
            return ("Vuot");
        }
        return ("Khong vuot");
    }

    public void nhap() throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ma nv: ");
        setMaNV(maNV = s.nextLine());
        System.out.print("Nhap so luong san pham: ");
        setSoSP(soSP = s.nextInt());
    }

    public static void inTieuDe() {
        System.out.printf("%-10s %-10s %-10s %-25s", "ma nv", "so sp", "luong", "tong ket");
        System.out.println("");
    }

    public void xuat() {
        
        System.out.printf("%-10s %-10d %-10f %-25s", maNV, soSP, getLuong(), getTongKet());
        System.out.println("");
    }
}
