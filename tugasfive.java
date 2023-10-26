/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

import java.util.Scanner;

public class tugasfive {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama;
        int kelas;
        double usia;
        float absen;
        
        System.out.println("Masukan Nama  : ");
        nama = input.nextLine();
        System.out.println("Masukan Kelas : ");
        kelas = input.nextInt();
        System.out.println("Masukan Usia  : ");
        usia = input.nextDouble();
        System.out.println("Masukan Absen : ");
        absen = input.nextFloat();
        
        System.out.println("Nama  : "+nama);
        System.out.println("Kelas : "+kelas);
        System.out.println("Usia  : "+usia);
        System.out.println("Absen : "+absen);
    }
}
