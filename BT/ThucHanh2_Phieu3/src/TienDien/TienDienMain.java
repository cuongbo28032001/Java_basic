package TienDien;

import java.util.ArrayList;
import java.util.Scanner;


public class TienDienMain {
    private static int n;
    public static void main(String[] args) {
        ArrayList<KHVN> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so khach hang: ");     n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            KHVN temp = new KHVN();
            temp.Nhap();
            list.add(temp);
        }
            System.out.println(list);
    }
}