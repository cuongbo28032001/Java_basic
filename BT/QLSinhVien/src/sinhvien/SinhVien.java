package sinhvien;

import person.PerSon;

public class SinhVien extends PerSon {
    private static int maSVtemp = 1;
    private int maSV;


    public void setMaSV() {
        this.maSV = maSVtemp++;
    }

    public int getMaSV() {
        return maSV;
    }


    public void EnterStudent()
    {
        setMaSV();
        super.EnterPerSon();
    }

    public static void Title()
    {
        System.out.printf("%10s %15s %15s %20s%n", "MaSV", "TenSV", "Tuoi", "DiaChi");
    }

    public void OutPut()
    {
        System.out.printf("%10s %15s %15d %20s%n", getMaSV(), getName(), getAge(), getAddress());
    }
}
