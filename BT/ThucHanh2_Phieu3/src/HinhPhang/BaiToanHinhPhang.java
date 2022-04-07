package HinhPhang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doan Cuong
 */
public class BaiToanHinhPhang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong();
        hv.nhap();
        System.out.println(hv);
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.Nhap();
        System.out.println(hcn);
        HinhTron ht = new HinhTron();
        ht.Nhap();
        System.out.println(ht);
    }
}
