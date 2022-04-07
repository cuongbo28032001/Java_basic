/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TienDien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class KHVN extends KhachHang {

    private String Doituong;
    KhachHang kh = new KhachHang();

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        KhachHang temp = new KhachHang();
        kh.Nhap();
        System.out.print("Nhap doi tuong: ");
        Doituong = sc.nextLine();
    }

    @Override
    public String toString() {
        return "KHVN{" + "Doituong: " + Doituong + ", Khach hang: " + kh + "}" + "\n";
    }
}
