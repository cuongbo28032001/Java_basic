/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_08_DoanQuocCuong;

import java.util.Scanner;

public class Buoi1_Bai1_DoanQuocCuong {

    public static void main(String[] args) {
        // tìm ucln của 2 số
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");  a = s.nextInt();
        System.err.print("Enter b: ");  b = s.nextInt();
        System.err.println("UCLN of " + a + " and " + b + " = " + UCLN(a, b));
        //Kiểm tra số nguyên tố
        System.err.println("\n--------------------");
        System.out.print("Enter a number : ");
        int c = s.nextInt();
        if (isPrime(c)) {
            System.out.println(c + " is a prime number");
        } else {
            System.out.println(c + " is not a prime number");
        }
    }
    public static int UCLN(int a, int b) {
        if (b == 0)  return a;
        if (a % b == 0)
            return b;
        return UCLN(b, a % b);
    }
    public static boolean isPrime(int c) {
        if (c <= 1) return false;
        for (int i = 2; i <= Math.sqrt(c); i++) {
            if (c % i == 0)
                return false;
        }
        return true;
    }
}
