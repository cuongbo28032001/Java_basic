
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Doan Cuong
 */
public class HinhTamGiac implements Comparable<HinhTamGiac> {

    private int  a, b, c;
    private String maHinh;

    public String getMaHinh() {
        return maHinh;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int ChuVi() {
        return a + b + c;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap ma hinh: ");
        while (true) {
            try {
                maHinh = sc.nextLine();
                if (Integer.parseInt(maHinh) < 0) {
                    throw new Exception("Ma hinh lon hon 0 ----------> Nhap lai: ");
                } else {
                    break;
                }
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        a = rd.nextInt(4) + 1;
        b = rd.nextInt(4) + 1;
        while (true) {
            try {
                c = rd.nextInt(4) + 1;
                if (a + b > c && a + c > b && b + c > a) {
                    break;
                } else {
                    throw new Exception("Tong 2 canh bat ki luon lon hon 1 canh -----------> Nhap lai");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void TieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s", "Ma", "Canh1", "Canh2", "Canh3", "ChuVi");
        System.out.println("");
    }

    public void Xuat() {
        System.out.printf("%10s %10d %10d %10d %10d", maHinh, a, b, c, ChuVi());
        System.out.println("");
    }

    @Override
    public int compareTo(HinhTamGiac o) {
        return this.getMaHinh().compareTo(o.getMaHinh());
    }

}
