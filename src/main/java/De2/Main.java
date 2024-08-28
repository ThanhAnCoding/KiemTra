/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        QuanLyCD qlcd = new QuanLyCD();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Xuat danh sach CD va tong tri gia");
            System.out.println("2. Lay CD phat hanh truoc nam 2020");
            System.out.println("3. Tim CD theo ten");
            System.out.println("4. Sap xep CD theo gia giam dan");
            System.out.println("5. Xoa CD theo ma so");
            System.out.println("6. Sua gia ban theo ma so");
            System.out.println("7. Tinh tong tri gia cac CD");
            System.out.println("0. Thoat");
            System.out.print("Lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    qlcd.XuatThongTin();
                    break;
                case 2:
                    qlcd.LayCDTruoc2020();
                    break;
                case 3:
                    qlcd.TimKiemTheoChuTinh();
                    break;
                case 4:
                    qlcd.SapXep();
                    System.out.println("Da sap xep theo gia giam dan.");
                    break;
                case 5:
                    System.out.print("Nhap ma so CD can xoa: ");
                    String masoXoa = scanner.nextLine();
                    qlcd.Xoa(masoXoa);
                    System.out.println("Da xoa CD co ma so: " + masoXoa);
                    break;
                case 6:
                    System.out.print("Nhap ma so CD can sua gia: ");
                    String masoSua = scanner.nextLine();
                    System.out.print("Nhap gia moi: ");
                    double giaMoi = scanner.nextDouble();
                    qlcd.Sua(masoSua, giaMoi);
                    System.out.println("Da sua gia CD co ma so: " + masoSua);
                    break;
                case 7:
                    double tongTriGia = qlcd.TongTriGia();
                    System.out.println("Tong tri gia cua cac CD: " + tongTriGia);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 0);
    }
}

