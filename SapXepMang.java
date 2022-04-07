package mang1chieu;
import java.util.Random;
import java.util.Scanner;
class SapXepMang{
    static int[] day;
    String str;
    int n=day.length;
        static void nhap(){	
            int n=day.length;
            Random rd=new Random();
            for (int k=0; k<n;k++)
                day[k]=rd.nextInt(20);
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
//ham chinh
public static void main (String[] args) {
    //khai báo số phần tử dãy và nhập số phần tử

    System.out.print (" Nhap vao so phan tu cua day");
    //xin cấp phát dãy số

    //nhập dãy số và in dãy trước khi nhập

    System.out.println ("day truuoc khi sap xep");

    //sắp xếp dãy số và in lại

    System.out.println ("day sau khi sap xep");

    }
}