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
public class ListNhanVien {

    static NhanVien dsNV[];
    static int n;

    public void nhaplist() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        n = s.nextInt();
        dsNV = new NhanVien[n];
        while (true) {
            try {

                for (int i = 0; i < n; i++) {
                    System.out.println("\t Nhap thong tin nhan vien " + (i + 1));
                    dsNV[i] = new NhanVien();
                    dsNV[i].nhap();
                }
                break;
            } catch (Exception e) {
                System.out.println("Nhap sai du lieu --> " + e);
            }
        }
    }

    public void xuatlist() {
        NhanVien.inTieuDe();
        for (int i = 0; i < n; i++) {
            dsNV[i].xuat();
        }
    }

    public void inVuotChuan() {
        NhanVien.inTieuDe();
        for (int i = 0; i < n; i++) {
            if (dsNV[i].coVuotChuan()) {
                dsNV[i].xuat();
            }
        }
    }
}
