
import java.util.LinkedHashSet;
import java.util.LinkedList;
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
public class Main {

    static LinkedHashSet<HinhTron> hTron = new LinkedHashSet<HinhTron>();
    static LinkedList<HinhTron> list = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        InPut();
        OutPut();
        Them();
        sapXep();
    }

    public static boolean checkma(String ma) {
        for (HinhTron hinhTron : hTron) {
            if (hinhTron.getMaHinh().equals(ma)) {
                return true;
            }
        }
        return false;
    }

    public static void InPut() {
        System.out.print("Nhap so hinh tron can them: ");
        n = sc.nextInt();
        int i = 0;
        while (i < n) {
            HinhTron hinhTron = new HinhTron();
            hinhTron.Nhap();
            if (hinhTron.getBanKinh() == 0) {
                break;
            } else {
                while (true) {
                    if (checkma(hinhTron.getMaHinh())) {
                        System.out.println("Ma hinh ton tai ----> Nhap lai");
                        hinhTron.Nhap();
                    } else {
                        hTron.add(hinhTron);
                        break;
                    }
                }
            }
            i++;
        }
    }

    public static void OutPut() {
        HinhTron.TieuDe();
        for (HinhTron hinhTron : hTron) {
            hinhTron.Xuat();
        }
    }

    public static void Them() {
        while (true) {
            HinhTron hinhTron = new HinhTron();
            hinhTron.Nhap();
            if (checkma(hinhTron.getMaHinh())) {

                hinhTron.Xuat();
                System.out.println("Khong them duoc");
                break;
            } else {
                System.out.println("Hinh muon them: ");
                HinhTron.TieuDe();
                hinhTron.Xuat();
                list = new LinkedList<>(hTron);
                list.addFirst(hinhTron);
                hTron = new LinkedHashSet<>(list);
                break;
            }
        }
        System.out.println("Sau them: ");
        HinhTron.TieuDe();
        for (HinhTron hinhTron : hTron) {
            hinhTron.Xuat();
        }
    }

    public static void sapXep() {
        list.sort(new HinTronCMPMa());
        hTron = new  LinkedHashSet<>(list);
        System.out.println("Sau sap xep: ");
        HinhTron.TieuDe();
        for (HinhTron hinhTron : hTron) {
            hinhTron.Xuat();
        }
    }
}
