
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

class Main {

    static ArrayList<HinhTamGiac> list = new ArrayList<>();
    static TreeSet<HinhTamGiac> treeSet = new TreeSet<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        NhapXuat();
        Sx_Ma();
        themHinh();
    }

    public static boolean checkMa(String ma) {
        for (HinhTamGiac hinhTamGiac : list) {
            if (ma.equals(hinhTamGiac.getMaHinh())) {
                return true;
            }
        }
        return false;
    }

    public static void NhapXuat() {
        System.out.print("Nhap so hinh tam giac: ");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {
            HinhTamGiac x = new HinhTamGiac();
            x.Nhap();
            if (checkMa(x.getMaHinh())) {
                System.out.println("Ma hinh ton tai ----> Nhap lai");
            } else {
                if (x.getMaHinh().equals("0")) {
                    break;
                } else {
                    list.add(x);
                }
            }
            i++;
        }

        System.out.println("Ban dau: ");
        HinhTamGiac.TieuDe();
        for (HinhTamGiac hinhTamGiac : list) {
            hinhTamGiac.Xuat();
        }
    }

    public static void Sx_Ma() {
        treeSet.addAll(list);
        System.out.println("TreeSet: ");
        HinhTamGiac.TieuDe();
        for (HinhTamGiac item : treeSet) {
            item.Xuat();
        }
        list.clear();
    }

    public static void themHinh() {
        list.addAll(treeSet);
        while (true) {
            try {
                System.out.print("Nhap vi tri can them: ");
                int vtri = sc.nextInt();
                if (vtri > list.size() + 1 || vtri < 0) {
                    throw new Exception("Vi tri can them phai thuoc khoang tu 0 den " + (list.size() + 1));
                } else {
                    while (true) {
                        HinhTamGiac hinhTamGiac = new HinhTamGiac();
                        hinhTamGiac.Nhap();
                        if (checkMa(hinhTamGiac.getMaHinh())) {
                            System.out.println("Khong them duoc do ma trung --------> Nhap lai");
                        } else {
                            list.add(vtri, hinhTamGiac);
                            System.out.println("Them thanh cong!");
                            break;
                        }
                       break; 
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Sau khi them: ");
        HinhTamGiac.TieuDe();
        for (HinhTamGiac hinhTamGiac1 : list) {
            hinhTamGiac1.Xuat();
        }
    }
}
