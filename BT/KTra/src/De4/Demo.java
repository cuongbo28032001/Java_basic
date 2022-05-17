/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class Demo {

    static int n;
    static HinhVuong[] a = new HinhVuong[10];

    public static void main(String[] args) {
        System.out.print("Nhap so hinh vuong: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        NhapList();
        HinhVuong.TieuDe();
        for (int i = 0; i < n; i++) {
            a[i].Xuat();
        }

        System.out.println("\n---------------------------------");
        FindAndUpDateByMa();
    }

    static int check(int maH) {
        for (int i = 0; i < n; i++) {
            if (a[i].maHinh == maH) {
                return i;
            }
        }
        return -1;
    }

    static void NhapList() {
        for (int i = 0; i < n; i++) {
            a[i] = new HinhVuong();
            a[i].Nhap();
            for (int j = 0; j < i; j++) {
                if (a[i].maHinh == a[j].maHinh) {
                    i--;
                }

            }
        }
    }

    static void FindAndUpDateByMa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hinh can tim: ");
        int ma = sc.nextInt();
        int index = check(ma);
        if (index == -1) {
            System.out.println("Khong co ma hinh can tim");
        } else {
            HinhVuong.TieuDe();
            a[index].Xuat();
            HinhVuong temp = new HinhVuong();
            
            System.out.println("------------Sau khi sua-----------" + index);
            temp.nhapdemo();
            for(int i=0; i<n; i++)
            {
                while(temp.maHinh == a[i].maHinh && i != index)
                {
                    temp.nhapdemo();
                    if(i==index && temp.maHinh == a[i].maHinh)
                        break;
                }
            }
            System.out.println("index = " + index);
            a[index] = temp;
            HinhVuong.TieuDe();
            for (int j = 0; j < n; j++) {
                a[j].Xuat();
            }
        }
    }
}
