/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhphang;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class HinhTron extends HinhPhang{
    protected static float banKinh;

    public HinhTron() {
    }
    
    
    public static void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }
    @Override
    float CV() {
        return (float) (banKinh*Math.PI);
    }

    @Override
    float DT() {
        return (float) (banKinh*banKinh*Math.PI);
    }

    @Override
    protected void Xuat() {
        super.Xuat(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
