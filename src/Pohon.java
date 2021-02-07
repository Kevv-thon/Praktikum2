/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Pohon {
    String nama = null;
    int tinggi = 0;
    Scanner input = new Scanner(System.in);
    
    void setNama() {
        System.out.print("Masukkan nama pohon : ");
        nama = input.nextLine();
    }
    void setTinggi() {
        System.out.print("Masukkan tinggi pohon");
        tinggi = input.nextInt();
    }
    void getNama() {
        System.out.println("Nama pohon : "+nama);
    }
    void getTinggi() {
        System.out.println("Tinggi pohon : "+tinggi);
    }
    
}
