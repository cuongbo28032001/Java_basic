/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class Main {

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();

        
        while (true) {
            try {
                System.out.println("\n\t\tNHAP THONG TIN NV 1");
                nv1.nhap();
                System.out.println("\n\t\tNHAP THONG TIN NV 2");
                nv2.nhap();
                nv1.inTieuDe();
                nv1.xuat();
                nv2.xuat();
                break;
            }
            catch (Exception e) {
                System.out.println("Nhap sai du lieu --> " + e);
            }

        }  

        ListNhanVien list = new ListNhanVien();
        list.nhaplist();
        System.out.println("\nDANH SACH VUA NHAP LA");
        list.xuatlist();

        System.out.println("\nDANH SACH VUOT CHUAN LA");
        list.inVuotChuan();
    }
}
