/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and import java.util.Scanner;

import javax.xml.ws.ServiceMode;
open the template in the editor.
 */
package bai17;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class Bai17 {
    
    // viet hoa ky tu dau tien cua chuoi
    static String handleString(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = s.nextLine();

        // chuyen tat ca ve viet thuong
        name = name.toLowerCase();

        // cat mang
        String[] arrTemp = name.split(" ");

        // viet hoa chu dau tien
        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = handleString(arrTemp[i]);
        }

        // join mang
        String result = String.join(" ", arrTemp);

        // in ket qua
        System.out.println("Ket qua: " + result);
    }
}