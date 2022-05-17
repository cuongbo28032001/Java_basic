/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.HinhPhang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class TGC implements HinhPhang {

    public String maHinh;
    public int a,b,c;

    @Override
    public float tinhCV() {
        return a+b+c;
    }

    @Override
    public float tinhDT() {
        return 0;
    }

    @Override
    public void inPut() {
        Random rd = new Random();
        System.out.print("Nhập mã hình: ");
        Scanner sc = new Scanner(System.in);
        maHinh = sc.nextLine();
        System.out.println("Nhập độ dài 3 cạnh");
        a = rd.nextInt(100)+1;
        while (true)
        {
            try {
                b = rd.nextInt(100)+1;
                if(a!=b) throw new Exception("a phải bằng b");
                while(true)
                {
                    try {
                        c = rd.nextInt(100)+1;
                        if(a+b<=c) throw new Exception("cạnh 1 + cạnh 2 > cạnh 3");
                        break;
                    }catch (Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void TieuDe()
    {
        System.out.printf("%-10s %-15s %-15s %-15s", "Mã", "Cajnh1,2", "Cạnh 3", "Chu vi");
        System.out.println("");
    }
    @Override
    public void outPut() {
        System.out.printf("%-10s %-15s %-15s %-15s", maHinh, a, c, tinhCV());
        System.out.println("");
    }
}
