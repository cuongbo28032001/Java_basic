/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
abstract class DaGiac {
    protected int maHinh;
    protected  int n;
    protected  int[] canh;
    
    public abstract void Nhap();
    
    public float tinhCV()
    {
        float sum = 0;
        for(int i=0; i< 4; i++)
        {
            sum += canh[i];
        }
        return sum;
    }
    
    abstract float tinhDT();
    
}
