package mainsinhvien;

import sinhvien.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainSinhVien {
    static List<SinhVien> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        EnterList();
        OutPutList();
        RandomTeam();
    }

    public static void EnterList()
    {
        System.out.print("Nhap so sinh vien muon them: ");
        n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            SinhVien sinhVien = new SinhVien();
            sinhVien.EnterStudent();
            list.add(sinhVien);
        }
    }

    public static void OutPutList()
    {
        SinhVien.Title();
        for (SinhVien sinhVien:list) {
            sinhVien.OutPut();
        }
    }

    public  static void RandomStudent(int countTeam, int memOfTeam, List<SinhVien> listTemp, Random rd)
    {
        for(int i=0; i<countTeam; i++)
        {
            System.out.println("TO " + (i+1) + ":");
            SinhVien.Title();
            for(int j=0; j<memOfTeam; j++)
            {
                if(listTemp.size()>0)
                {
                    int index = rd.nextInt(listTemp.size());
                    listTemp.get(index).OutPut();
                    listTemp.remove(index);
                }
                else break;
            }
        }
    }

    public static void RandomTeam()
    {
        Random rd = new Random();
        System.out.print("Nhap so nguoi trong 1 to: ");
        int memOfTeam = sc.nextInt();
        int countTeam;
        List<SinhVien> listTemp = list;
        if(n%memOfTeam==0)
        {
            countTeam = n/memOfTeam;
        }
        else
        {
            if(n%memOfTeam < memOfTeam-1)
            {
                countTeam = n/memOfTeam;
                memOfTeam = memOfTeam + 1;
            }
            else {
                countTeam = n / memOfTeam + 1;
            }
        }
        RandomStudent(countTeam, memOfTeam, listTemp, rd);
    }
}
