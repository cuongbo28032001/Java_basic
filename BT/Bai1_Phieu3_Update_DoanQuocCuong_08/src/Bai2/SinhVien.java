/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import sun.invoke.empty.Empty;

import javax.xml.transform.sax.SAXSource;

/**
 *
 * @author Doan Cuong
 */
public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLT, diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTen() {
        String[] tens = hoTen.trim().split(" ");
        return tens[tens.length - 1];
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) throws Exception, InputMismatchException{
        if(diemLT < 0) throw  new Exception("Điểm LT>= 0");
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH)throws Exception{
        if(diemTH < 0) throw  new Exception("Điểm TH>= 0");
        this.diemTH = diemTH;
    }

    public double getDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    public String getTB() {
        if (getDiemTB() >= 5) {
            return "Đậu";
        }
        return "Trượt";
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        while (true)
        {
            try {
                System.out.print("Nhap diem thuc hanh: ");
                setDiemTH((float) (diemTH = sc.nextFloat()));
                break;
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        while (true)
        {
            try {
                System.out.print("Nhap diem ly thuyet: ");
                setDiemLT((float) (diemLT = sc.nextFloat()));
                break;
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }

    static void TieuDe() {
        System.out.printf("%10s  %10s %20s %10s %10s %10s", "Ma SV", "Ho Ten", "Diem TH", "Diem LT", "DiemTB", "KetQua");
        System.out.println("");
    }

    public void inDuLieu() {
        System.out.printf("%10s %10s %20.2f %10.2f %10.2f %10s", maSV, hoTen, diemTH, diemLT, getDiemTB(), getTB());
        System.out.println("");
    }
}
