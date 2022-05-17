/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Doan Cuong
 */
abstract class Hinh2chieu {
    protected String maHinh;
    protected int[] canh;
    public float tinhCV()
    {
        return 0;
    }
    abstract float tinhDT();
    abstract void inPut();
    abstract void outPut();
}
