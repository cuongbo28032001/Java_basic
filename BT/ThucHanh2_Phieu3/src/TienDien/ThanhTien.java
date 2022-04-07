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
abstract class ThanhTien{
    public int solg, dinhmuc;
    public float dongia;
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong: ");      solg = sc.nextInt();
        System.out.print("Nhap dinh muc: ");      dinhmuc = sc.nextInt();
        System.out.print("Nhap don gia: ");      dongia = sc.nextFloat();
    }
    
    public float Tien()
    {
        if(solg<=dongia)
        {
             
            return solg*dongia;
        }
        else
        {
            return (float) ((solg-dinhmuc)*dongia*2.5+(solg-(solg-dinhmuc))*dongia);
        }
    }
    
    public float Tien2()
    {
        return solg*dongia;
    }

    @Override
    public String toString() {
        return "ThanhTien{" + "solg=" + solg + ", dinhmuc=" + dinhmuc + ", dongia=" + dongia + '}';
    }
}
