
import java.util.Random;
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
public class HinhTron {
    private float banKinh;
    private String maHinh;

    public void setBanKinh(float banKinh) throws Exception {
        if(banKinh < 0)
        {
            throw new Exception("Ban kinh >= 0 ------> Nhap lai");
        }
        this.banKinh = banKinh;
    }

    public void setMaHinh(String maHinh)  {
        this.maHinh = maHinh;
    }
    
    public float getBanKinh() {
        return banKinh;
    }

    public String getMaHinh() {
        return maHinh;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        maHinh = "HT-" + rand.nextInt(10)+10;
        while(true)
        {
            try {
                System.out.print("Nhap ban kinh: ");
                setBanKinh(banKinh = sc.nextFloat());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public float ChuVi()
    {
        return (float) (2*Math.PI*banKinh);
    }
    
     public float DienTich()
    {
        return (float) (Math.PI*banKinh*banKinh);
    }
    
    public static void TieuDe()
    {
        System.out.printf("%10s %10s %10s %10s","MaHinh", "BanKinh", "ChuVi","DienTich");
        System.out.println("");
    }
    
    public void Xuat()
    {
        System.out.printf("%10s %10.2f %10.2f %10.2f",maHinh, banKinh, ChuVi(),DienTich());
        System.out.println("");
    }
}
