/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TienDien;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class NgayHD{
    public int ngay,thang,nam;
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");      ngay = sc.nextInt();
        System.out.print("Nhap thang: ");      thang = sc.nextInt();
        System.out.print("Nhap nam: ");      nam = sc.nextInt();
    }

    @Override
    public String toString() {
        return "{" + ngay + '/' + thang + "/" + nam + "}";
    }

   
}
