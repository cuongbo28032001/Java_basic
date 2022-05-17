/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class HinhVuong extends DaGiac{

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        this.maHinh = rd.nextInt(8) + 1;
        int a = rd.nextInt(8) + 1;
        this.canh = new int[4];
        for(int i=0; i<4; i++)
        {
            this.canh[i] = a;
        }
    }
    public void nhapdemo()
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap ma: ");
        this.maHinh = sc.nextInt();
        int a = rd.nextInt(8) + 1;
        this.canh = new int[4];
        for(int i=0; i<4; i++)
        {
            this.canh[i] = a;
        }
    }
    
    static void TieuDe()
    {
        System.out.printf("%10s %10s %10s %10s" , "Ma", "Canh", "Chu vi", "Dien tich");
        System.out.println("");
    }
    public void Xuat()
    {
        System.out.printf("%10d %10d %10.2f %10.2f", this.maHinh, this.canh[0], this.tinhCV(), this.tinhDT());
        System.out.println("");
    }

    @Override
    float tinhDT() {
        return this.canh[0] * this.canh[0];
    }
}
