
import java.util.ArrayList;
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
public class Main_Demo {

    static ArrayList<PhongHoc> list = new ArrayList<PhongHoc>();
    static int choose;
    static Scanner sc = new Scanner(System.in);

    static Boolean checkMP(String mp) {
        for (PhongHoc phongHoc : list) {
            if (phongHoc.getMaPhong().compareTo(mp) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void findByMaPhong() {
        System.out.print("---->Nhap ma phong can tim: ");
        sc.nextLine();
        String mp = sc.nextLine();
        PhongHoc x = null;

        for (PhongHoc phongHoc : list) {
            if (!checkMP(mp)) {
                x = phongHoc;
            }
        }
        if (x != null) {
            System.out.println(x.toString());
        } else {
            System.out.println("---->khong co ma phong trong list");
        }
    }

    public static void UpdateCountPC() {
        System.out.print("---->Nhap ma phong can cập nhật: ");
        sc.nextLine();
        String mp = sc.nextLine();
        int index = -1;
        for(PhongHoc phonghoc : list)
        {
            if(phonghoc.getMaPhong().compareTo(mp) == 0)
            {
                index = list.indexOf(phonghoc);
                break;
            }
        }
        if(index ==-1)
        {
            System.out.println("----->Ma phong khong ton tai");
        }
        else
        {
            System.out.println("\t\t\nDanh sách ban đầu");
        for(PhongHoc phonghoc : list)
        {
            System.out.println(phonghoc.toString());
        }
        
        PhongMayTinh temp = new PhongMayTinh();
        if (list.get(index) instanceof PhongMayTinh) {
            temp = (PhongMayTinh) list.get(index);
        }
        while (true) {
            try {
                System.out.print("Nhap so may tinh cua phong: ");
                int somaytinh = sc.nextInt();
                temp.setSoMayTinh(somaytinh);
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        list.set(index, temp);
        System.out.println("\t\t\nSau khi cap nhat");
        for(PhongHoc phonghoc : list)
        {
            System.out.println(phonghoc.toString());
        }
        }
    }
    
    public static void Remove_By_MP()
    {
        System.out.print("---->Nhap ma phong can xoa: ");
        sc.nextLine();
        String mp = sc.nextLine();
        int index = -1;
        for(PhongHoc phonghoc : list)
        {
            if(phonghoc.getMaPhong().compareTo(mp) == 0)
            {
                index = list.indexOf(phonghoc);
                break;
            }
        }
        if(index == -1)
        {
            System.out.println("----->Ma phong khong ton tai");
        }
        else{
            list.remove(index);
        System.out.println("\t\t\nSau xoa");
        for(PhongHoc phonghoc : list)
        {
            System.out.println(phonghoc.toString());
        }
        }
    }

    public static void themMoi() throws Exception {
        int luachon;

        while (true) {
            try {
                System.out.println("Nhap lua chon loai phong can nhap:");
                System.out.println("1.Phong Ly thuyet");
                System.out.println("2.Phong Thuc hanh");
                System.out.println("3.Phong May tinh");
                System.out.print("\nLua chon: ");
                int temp = sc.nextInt();
                if (temp < 0 || temp > 3) {
                    throw new Exception("---->ngoai vung chon");
                }
                luachon = temp;
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        switch (luachon) {
            case 1:
                while (true) {
                    PhongHocLyThuyet x = new PhongHocLyThuyet();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
            case 2:
                while (true) {
                    PhongThiNghiem x = new PhongThiNghiem();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
            case 3:
                while (true) {
                    PhongMayTinh x = new PhongMayTinh();
                    x.nhap();
                    if (!checkMP(x.maPhong)) {
                        list.add(x);
                        break;
                    }
                    System.out.println("---->Ma phong da ton tai!");
                }
                break;
        }

    }

    public static void main(String[] args) {
        list.add(new PhongHocLyThuyet(1, "404", "A9", 45.0f, 7));
        list.add(new PhongThiNghiem("Hoa", 45, 2, "705", "A1", 70.0f, 5));
        list.add(new PhongMayTinh(45, "704", "A1", 65.0f, 35));
        while (true) {

            System.out.println("Lua chon chuc nang");
            System.out.println("1.Them moi phong hoc");
            System.out.println("2. Tìm kiếm phòng học");
            System.out.println("5. Update số máy tính");
            System.out.println("6. Xóa phòng học");

            System.out.print("Nhap lua chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                try {
                    themMoi();
                } catch (Exception e) {
                }
                break;
                case 2:
                    findByMaPhong();
                    break;
                case 5:
                    UpdateCountPC();
                    break;
                case 6:
                    Remove_By_MP();
                    break;
                default:
                    return;
            }
        }

    }

}
