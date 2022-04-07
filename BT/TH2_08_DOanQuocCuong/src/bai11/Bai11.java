/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai11 {
    static List<Integer> listNguyenTo = new ArrayList<Integer>(); // mang so nguyen to
    static void nhap(int array[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    static void xuat(int array[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
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

    static void tachMangNguyenTo(int array[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(checkNguyenTo(array[i][j]) == 1) {                    
                    listNguyenTo.add(array[i][j]);
                }
            }            
        }
    }

    static int timMax() {
        int max = listNguyenTo.get(0);
        for(int i = 0; i < listNguyenTo.size(); i++) {
            if(max < listNguyenTo.get(i)) {
                max = listNguyenTo.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] arr2;
        int n, m;

        do {
            System.out.println("Nhap so dong: ");
            n = s.nextInt();

            System.out.println("Nhap so cot: ");
            m = s.nextInt();
        } while (n < 0 || m < 0);

        arr2 = new int[n][m];

        nhap(arr2, n, m);

        xuat(arr2, n, m);

        tachMangNguyenTo(arr2, n, m);

        // in mang nguyen to
        System.out.println("------ mang nguyen to ------");
        for (int i : listNguyenTo) {
            System.out.print(i + " ");
        }

        System.out.println("\nSo nguyen to lon nhat la: " + timMax());

    }
}