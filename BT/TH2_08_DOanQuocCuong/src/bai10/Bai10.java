/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class Bai10 {
    static List<Integer> listB = new ArrayList<Integer>(); // ds so nguyen to
    static List<Integer> listC = new ArrayList<Integer>(); // ds con lai
    static List<Integer> listResult = new ArrayList<Integer>(); // ds ket qua

    static void nhap(int array[], int n) {
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    static void xuat(int array[], int n) {
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    static int checkNguyenTo(int number) {
        // 1: so nguyen to
        // 0: khong phai so nguyen to
        if (number < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    static void tachMang(int array[], int n) {
        for (int i = 0; i < n; i++) {
            if (checkNguyenTo(array[i]) == 1) {
                listB.add(array[i]);
            } else {
                listC.add(array[i]);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int n;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Nhap so phan tu cua mang: ");
            n = s.nextInt();
        } while (n < 0);

        int array[] = new int[n];

        nhap(array, n);
        xuat(array, n);

        tachMang(array, n);

        Collections.sort(listB);
        Collections.sort(listC);

        // in mang B
        System.out.println("list B: ");
        for (int i : listB) {
            System.out.print(i + " ");
        }
        System.out.println();

        // in mang C
        System.out.println("list C: ");
        for (int i : listC) {
            System.out.print(i + " ");
        }
        System.out.println();

        // in mang ket qua
        listB.addAll(listC);
        System.out.println("list result: ");
        for (int i : listB) {
            System.out.print(i + " ");
        }
    }
}