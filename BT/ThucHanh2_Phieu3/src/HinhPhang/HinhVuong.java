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
class HinhVuong extends HinhPhang{
    float canh;
    @Override
    float tinhCV()
    {
        return canh*4;
    }

    @Override
    float tinhDT() {
        return canh*canh;
    }
    public void nhap()
    {
        System.out.print("Nhap do dai canh: ");
        Scanner sc = new Scanner(System.in);
        canh = sc.nextFloat();
    }
    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh + " Chu vi: " + tinhCV() + " Dien tich: " + tinhDT()+ '}';
    }

 
}
