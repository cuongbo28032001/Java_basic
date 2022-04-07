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
public class HinhTron extends HinhPhang{
    float r;

    @Override
    float tinhCV() {
        return (float) (2*r*Math.PI);
    }

    @Override
    float tinhDT() {
        return (float) (r*r*Math.PI);
    }
    
    public void Nhap()
    {
        System.out.print("Nhap do dai canh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + " Chu vi: " + tinhCV() + " Dien tich: " + tinhDT()+'}';
    }
    
    
}
