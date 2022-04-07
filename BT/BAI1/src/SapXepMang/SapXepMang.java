package SapXepMang;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

class SapXepMang{
    static Integer[] day;    
    static int n;

    static void nhap(){	
        int n = day.length;
        Random rd = new Random();
        for (int k = 0; k < n; k++) {
            day[k] = rd.nextInt(20);
        }
    }
    static void hienThi()
    {	int n=day.length;
            for(int k=0; k<n;k++)
                    System.out.print (day[k]+" ");
    }
    // sap xep day
    static void sapXep(){
        int tg;
        for( int i=0;i<day.length;i++)
            for( int j=i+1;j<day.length;j++)
                if (day[i]>day[j]){ 
                    tg=day[i];
                    day[i]=day[j];
                    day[j]=tg;
                }
    }
    static int timMin() {
        return Collections.min(Arrays.asList(day));
    }
    static int timMax() {
        return Collections.max(Arrays.asList(day));
    }
    
//ham chinh
public static void main (String[] args) {
    //khai báo số phần tử dãy và nhập số phần tử    
    System.out.print ("Nhap vao so phan tu cua day: ");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();

    //xin cấp phát dãy số
    day = new Integer[n];

    //nhập dãy số và in dãy trước khi nhập
    nhap();
    System.out.println ("\n===> day truuoc khi sap xep");
    hienThi();

    //sắp xếp dãy số và in lại
    sapXep();
    System.out.println ("\n===>day sau khi sap xep");
    hienThi();

    // tim min
    System.out.println("\n===>Min cua day la: " + timMin());

    // tim max
    System.out.println("\n===>Max cua day la: " + timMax());
    
    }
}