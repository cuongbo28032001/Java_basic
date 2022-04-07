/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class SinhVienMain {

    static ArrayList<SinhVien> list = new ArrayList<>();
    static int n;
    static SinhVien sinhVien1 = new SinhVien();
    static SinhVien sinhVien2 = new SinhVien(1, "Cuong", 1, 1.0);
    static SinhVien sinhVien3 = new SinhVien();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------Nhap sinh vien 1-----------------------");
        sinhVien1.Nhap();
//        System.out.println("-----------------------Nhap sinh vien 3-----------------------");
//        System.out.print("Nhap ma sinh vien: ");
//        int masv = sc.nextInt();
//        sinhVien3.setMaSV(masv);
//        sc.nextLine();
//        System.out.print("Nhap ho ten: ");
//        String hoten = sc.nextLine();
//        sinhVien3.setHoTen(hoten);
//        System.out.print("Nhap diem ly thuyet: ");
//        float diemlt = sc.nextFloat();
//        sinhVien3.setDiemLT(diemlt);
//        System.out.print("Nhap diem thuc hanh: ");
//        float diemth = sc.nextFloat();
//        sinhVien3.setDiemTH(diemth);
        SinhVien.TieuDe();
        sinhVien1.inDuLieu();
        sinhVien2.inDuLieu();
//        sinhVien3.inDuLieu();

        NhapList();
        SortByNameByPoint();
        System.out.println("Sinh viên có điểm trung bình max là: " + DiemMAX());
        System.out.println("Sinh viên có điểm trung bình min là: " + DiemMIN());

    }
    
    static void NhapList()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: "); 
        n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhập sinh viên thứ " +(i+1));
            SinhVien temp = new SinhVien();
            temp.Nhap();
            list.add(temp);
        }
    }

    static void SortByNameByPoint()
    {
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                int a= o1.getTen().compareTo(o2.getTen());
                if(a != 0)
                {
                    return a;
                }
                else return (int)(o1.getDiemTB() - o2.getDiemTB());
            }
        });
        System.out.println("Sắp xếp theo tên và điểm trung bình tăng dần ");
        SinhVien.TieuDe();
        for (SinhVien i: list) {
            i.inDuLieu();
        }
    }

    static SinhVien DiemMAX() {
        SinhVien x = Collections.max(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
              return (int)(o1.getDiemTB() - o2.getDiemTB());
            }
        });
        return x;
    }
    static SinhVien DiemMIN() {
        SinhVien x = Collections.min(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
              return (int)(o1.getDiemTB() - o2.getDiemTB());
            }
        });
        return x;
    }
}
