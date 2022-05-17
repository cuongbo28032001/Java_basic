/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Comparator;

/**
 *
 * @author Doan Cuong
 */
public class HinTronCMPMa implements Comparator<HinhTron> {

    @Override
    public int compare(HinhTron o1, HinhTron o2) {
        return o1.getMaHinh().compareTo(o2.getMaHinh());
    }
    
}
