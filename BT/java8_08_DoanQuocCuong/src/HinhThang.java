
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
public class HinhThang extends Hinh2chieu{
    
    public int chieuCao;
    
    @Override
    float tinhDT() {
       return (this.canh[0] + this.canh[2])*chieuCao/2;
    }

    @Override
    void inPut() {
        System.out.print("Nhap ma hinh: ");
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        this.maHinh = sc.nextLine();
        for(int i=0; i<4; i++)
        {
            this.canh[i] = rd.nextInt(49)+1;
        }
        chieuCao = rd.nextInt(49)+1;    
    }

    static void TieuDe()
    {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s, %-10s %-10s", "Ma", "Canh1", "canh2", "Canhben1", "Canhben2","ChuVi","DienTich");
        System.out.println("");
    }
    @Override
    void outPut() {
        System.out.printf("%-10s %-10d %-10d %-10d %-10d %-10.2f %-10.2f", this.maHinh, this.canh[0], this.canh[1], this.canh[2], this.canh[3], this.tinhCV(), this.tinhDT());
        System.out.println("");
    }
    
}
