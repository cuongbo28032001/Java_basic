package Bai3;

import Bai1.HinhPhang;
import Bai2.TGC;
import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

public class ListTGC {
    static TGC[] array = new TGC[10];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sô hình tam giác: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = new TGC();
            array[i].inPut();
            for (int j = 0; j < i; j++) {
                if (array[i].maHinh.compareTo(array[j].maHinh) == 0) {
                    System.out.println("Mã hình không được trùng nhau");
                    i--;
                }
            }
        }

        TGC.TieuDe();
        for (int i = 0; i < n; i++) {
            array[i].outPut();
        }
        System.out.println("\n-----------------MAX-----------------");
        TGC.TieuDe();
        FinMAX().outPut();
        SortByCodd();
    }

    static TGC FinMAX() {
        TGC temp = new TGC();
        temp = array[0];
        for (int i = 1; i < n; i++) {
            if (array[0].tinhCV() < array[i].tinhCV()) {
                temp = array[i];
            }
        }
        return temp;
    }

    static void SortByCodd()
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(array[i].maHinh.compareTo(array[j].maHinh) < 0)
                {
                    TGC temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sap xep");
        TGC.TieuDe();
        for(int i=0; i<n; i++)
            {
                array[i].outPut();
            }
    }
}
