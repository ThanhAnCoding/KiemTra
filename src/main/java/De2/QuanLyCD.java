/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLyCD {
    
    
      static List<CD> ListCD = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
     
     public void QuanLyCD(){     
      ListCD.add(new CD("CD01","Noi Buon Gac Tro","Quang Linh",195000,2018));
      ListCD.add(new CD("CD02","Bai Tinh Ca Dem","Duc Tuan",185000,2021));
      ListCD.add(new CD("CD03","Cau Ho Chieu Que","Nhieu Ca Si",172000,2022));
      ListCD.add(new CD("CD04","Tinh Dau Tinh Cuoi","Van Khanh",139000,2022));
      ListCD.add(new CD("CD05","Thanh Pho Mua Bay","Dan Nguyen",182000,2019));
     }
     public  void XuatThongTin(){
       double tongTriGia = 0;
        for (CD cd : ListCD) {
            System.out.println(cd);
            tongTriGia += cd.getGiaBan();
        }
        System.out.println("Tong tri gia cua cac CD: " + tongTriGia);
     }
      public  void LayCDTruoc2020(){
            for (CD cd : ListCD){
                if(cd.getNamPhatHanh()<2020){
                    System.out.println(cd.getTenCD());
                }
            }
      }
      public  void TimKiemTheoChuTinh(){
            for (CD cd : ListCD) {
            if (cd.getTenCD().toLowerCase().contains("tinh")) {
                System.out.println(cd);
            }
        }
      }
      public  void SapXep(){
          Collections.sort(ListCD, new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD cd2) {
                return Double.compare(cd2.getGiaBan(), cd1.getGiaBan());
            }
        });
      }
      
      public void Xoa(String cdCanXoa){
           for(CD cd:ListCD){
               if(cd.getMaSo() == cdCanXoa){
                   ListCD.remove(cd);
               }
           }    
      }
       public void Sua(String maso, double giaMoi) {
        for (CD cd : ListCD) {
            if (cd.getMaSo().equals(maso)) {
                cd.setGiaBan(giaMoi);
                break;
            }
        }
    }
      public double TongTriGia() {
        double tong = 0;
        for (CD cd : ListCD) {
            tong += cd.getGiaBan();
        }
        return tong;
    }
}
