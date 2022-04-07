/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_phieu4;

import java.util.Scanner;

/**
 *
 * @author Doan Cuong
 */
public class Bai2_Phieu4 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static int soLgKH,  checkKH;
    static KhachHang khachHangs[];
    public static void main(String[] args) {
        // TODO code application logic here
        nhapDanhSachKhachHang();
        hienThiDanhSachKhachHang();
    }
    
    static void nhapDanhSachKhachHang() {
        System.out.print("Nhap so luong khach hang: ");
        soLgKH = sc.nextInt();
        khachHangs = new KhachHang[soLgKH];
        for (int i = 0; i < soLgKH; i++) {
            System.out.println("Thong tin khach hang " + (i + 1));
            System.out.print("1. Khach hang Viet Nam\n2. Khach hang nuoc ngoai\nLua chon: ");
            checkKH = sc.nextInt();
            if (checkKH == 1) {
                khachHangs[i] = new KHVN();
            } else {
                khachHangs[i] = new KHNN();
            }
            khachHangs[i].nhapKhachHang();
        }
    }

    static void hienThiDanhSachKhachHang() {
        System.out.println("Khach hang Viet Nam: ");
        KHVN.tieuDe();
        for (KhachHang khachHang : khachHangs) {
            if (khachHang instanceof KHVN) {
                khachHang.xuatKhachHang();
            }
        }

        System.out.println("Khach hang nuoc ngoai: ");
        KHNN.tieuDe();
        for (KhachHang khachHang : khachHangs) {
            if (khachHang instanceof KHNN) {
                khachHang.xuatKhachHang();
            }
        }
    }
    static void soLuongDien() {
        int soLuongVietNam = 0;
        int soLuongNuocNgoai = 0;

        for (KhachHang element : khachHangs) {
            if (element instanceof KHVN) {
                soLuongVietNam += element.soLuong;
            }
        }

        for (KhachHang element : khachHangs) {
            if (element instanceof KHNN) {
                soLuongNuocNgoai += element.soLuong;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println("So luong dien tieu dung Viet Nam: " + soLuongVietNam);
        System.out.println("So luong dien tieu dung nuoc ngoai: " + soLuongNuocNgoai);
    }

    static void trungBinhThanhTienKhachHangNuocNgoai() {
        double thanhTienTrungBinh = 0;
        int soLuongKhachNuocNgoai = 0;

        for (KhachHang element : khachHangs) {
            if (element instanceof KHNN) {
                thanhTienTrungBinh += element.ThanhTien();
                soLuongKhachNuocNgoai++;
            }
        }

        System.out.println("---------------------------------------");
        System.out.printf("Trung binh thanh tien khach hang nuoc ngoai: %10.2f\n", thanhTienTrungBinh / soLuongKhachNuocNgoai);
    }

    static void hienThiHoaDonTheoNgay() {
        System.out.println("---------------------------------------");
        System.out.println("Hoa don trong thang 09 nam 2013 (Viet Nam):");
        int countVietNam = 0;
        int countNuocNgoai = 0;
        for (KhachHang element : khachHangs) {
            if (element instanceof KHVN) {
                if (((KHVN) element).date.thang == 9 && ((KHVN) element).date.nam == 2013) {
                    countVietNam++;
                }
            }
        }

        for (KhachHang element : khachHangs) {
            if (element instanceof KHNN) {
                if (element.date.thang == 9 && element.date.nam == 2013) {
                    countNuocNgoai++;
                }
            }
        }

        if (countVietNam != 0) {
            KHVN.tieuDe();
            for (KhachHang element : khachHangs) {
                if (element instanceof KHVN) {
                    if (element.date.thang == 9 && element.date.nam == 2013) {
                        element.xuatKhachHang();
                    }
                }
            }
        } else {
            System.out.println("Khong co hoa don");
        }

        System.out.println("---------------------------------------");
        System.out.println("Hoa don trong thang 09 nam 2013 (nuoc ngoai):");
        if (countNuocNgoai != 0) {
            KHNN.tieuDe();
            for (KhachHang element : khachHangs) {
                if (element instanceof KHNN) {
                    if (element.date.thang == 9 && element.date.nam == 2013) {
                        element.xuatKhachHang();
                    }
                }
            }
        } else {
            System.out.println("Khong co hoa don");
        }
    }
}
