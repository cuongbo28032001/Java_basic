
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doan Cuong
 */
public class Demo {
    static HinhThang[] a = new HinhThang[15];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hinh thang: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("Nhap hinh thang " + (i+1));
            a[i] = new HinhThang();
            a[i].inPut();
            for(int j=0; j<i; j++)
            {
                if(a[i].maHinh.compareTo(a[j].maHinh) == 0)
                {
                    System.out.println("Ma khong duoc trung nhau ----> NHAP LAI");
                    i--;
                }
            }
        }
        System.out.println("\n-----------------Danh sach sau nhap-----------");
        HinhThang.TieuDe();
        for(int i=0; i<n; i++)
        {
            a[i].outPut();
        }
        System.out.println("\n-----------------MAX-----------");
        HinhThang.TieuDe();
        MAX().outPut();
        SapXep();
    }
    
    static HinhThang MAX()
    {
        HinhThang temp = new HinhThang();
        temp = a[0];
        for (int i = 1; i < n; i++) {
            if (a[0].tinhCV() < a[i].tinhCV()) {
                temp = a[i];
            }
        }
        return temp;
    }
    
    static void SapXep()
    {
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i].tinhCV() < a[j].tinhCV())
                {
                    HinhThang temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n------------------Danh sach sau sap xep--------------");
        HinhThang.TieuDe();
        for(int i=0; i<n; i++)
        {
            a[i].outPut();
        }
    }
}
