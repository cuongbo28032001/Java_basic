/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhphang;

/**
 *
 * @author Doan Cuong
 */
abstract class HinhPhang {
    abstract float CV();
    abstract float DT();
    protected void Xuat()
    {
        System.out.println("Chu vi: " + CV() + "   Dien tich: " + DT());
    }
}
