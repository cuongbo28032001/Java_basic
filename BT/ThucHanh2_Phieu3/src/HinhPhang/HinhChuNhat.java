package HinhPhang;


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
public class HinhChuNhat extends HinhPhang{
    float d,r;

    @Override
    float tinhCV() {
        return (d+r)*2;
    }

    @Override
    float tinhDT() {
        return d*r;
    }

    public void Nhap()
    {
        System.out.print("Nhap chieu dai: ");
        Scanner sc = new Scanner(System.in);
        d = sc.nextFloat();
        System.out.println("Nhap chieu rong: ");
        r = sc.nextFloat();
    }
    @Override
    public String toString() {
        return "HinhChuNhat{" + "d=" + d + ", r=" + r + " Chu vi: " + tinhCV() + " Dien tich: " + tinhDT() + '}';
    }
    
    
}
